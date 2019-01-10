package www.yqc.com.wethertest.ui.fragment

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import okhttp3.Call
import okhttp3.Response
import org.litepal.LitePal
import www.yqc.com.wethertest.R
import www.yqc.com.wethertest.db.City
import www.yqc.com.wethertest.db.County
import www.yqc.com.wethertest.db.Province
import www.yqc.com.wethertest.ui.activity.WeatherActivity
import www.yqc.com.wethertest.ui.adapter.WeatherAdapter
import www.yqc.com.wethertest.util.DataUtil
import www.yqc.com.wethertest.util.HttpUtil
import java.io.IOException
import java.util.*

/**
 * Created by Administrator on 2019/1/8.
 */
class ChooseFragment : Fragment() {
    companion object {
        val LEVEL_PROVINCE = 0
        val LEVEL_CITY = 1
        val LEVEL_COUNTY = 2
    }

    lateinit var mTitle: TextView
    lateinit var mBack: Button
    lateinit var mRecyclerView: RecyclerView
    lateinit var mAdapter: WeatherAdapter
    lateinit var selectedProvince: Province
    lateinit var selectedCity: City
    lateinit var selectedCounty: County

    var dataList = ArrayList<String>()
    lateinit var provinceList: MutableList<Province>
    lateinit var cityList: MutableList<City>
    lateinit var countyList: MutableList<County>
    val linearLayoutManager = LinearLayoutManager(activity)
    var currentLevel = -1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose, container, false)
        mTitle = view.findViewById(R.id.title) as TextView
        mBack = view.findViewById(R.id.back) as Button
        mRecyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        mAdapter = WeatherAdapter()
        mRecyclerView.layoutManager = linearLayoutManager
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        queryProvince()
        mAdapter.listener = object : WeatherAdapter.itemClickListener {
            override fun onItemClick(position: Int) {
                if (currentLevel == LEVEL_PROVINCE) {
                    selectedProvince = provinceList[position]
                    queryCity()
                } else if (currentLevel == LEVEL_CITY) {
                    selectedCity = cityList[position]
                    queryCounty()
                } else {
                    val intent = Intent(activity, WeatherActivity::class.java)
                    intent.putExtra("address", dataList[position])
                    activity!!.startActivity(intent)
                }
            }
        }
        mBack.setOnClickListener {
            if (currentLevel == LEVEL_COUNTY) {
                queryCity()
            } else if (currentLevel == LEVEL_CITY) {
                queryProvince()
            }
        }
    }

    fun queryProvince() {
        mTitle.text = "中国"
        provinceList = LitePal.findAll(Province::class.java)

        if (provinceList.size > 0) {

            dataList.clear()
            for (item in provinceList) {
                dataList.add(item.provinceName!!)
            }
            currentLevel = LEVEL_PROVINCE
            mAdapter.data = dataList
            mRecyclerView.adapter = mAdapter
            mAdapter.notifyDataSetChanged()
        } else {
            val address = "http://guolin.tech/api/china"
            queryFromServer(address, "province")
        }
    }

    fun queryCity() {
        mTitle.text = selectedProvince.provinceName
        cityList = LitePal.where("provinceid=?", selectedProvince.provinceId.toString()).find(City::class.java)
        if (cityList.size > 0) {
            dataList.clear()
            for (item in cityList) {
                dataList.add(item.cityName!!)
            }
            currentLevel = LEVEL_CITY
            mAdapter.data = dataList
            mAdapter.notifyDataSetChanged()
        } else {
            val address = "http://guolin.tech/api/china/" + selectedProvince.provinceId
            queryFromServer(address, "city")
        }
    }

    fun queryCounty() {
        mTitle.text = selectedCity.cityName
        countyList = LitePal.where("cityid=?", selectedCity.cityId.toString()).find(County::class.java)
        if (countyList.size > 0) {
            dataList.clear()
            for (item in countyList) {
                dataList.add(item.countyName!!)
            }
            currentLevel = LEVEL_COUNTY
            mAdapter.data = dataList
            mAdapter.notifyDataSetChanged()
        } else {
            val address = "http://guolin.tech/api/china/" + selectedProvince.provinceId + "/" + selectedCity.cityId
            queryFromServer(address, "county")
        }
    }

    fun queryFromServer(address: String, type: String) {
        showDialog()
        HttpUtil.sendHttpRequest(address, object : okhttp3.Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                activity!!.runOnUiThread {
                    dialog!!.dismiss()
                    Toast.makeText(activity, "加载失败", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onResponse(call: Call?, response: Response?) {
                val res = response!!.body()!!.string()
                val result = when (type) {
                    "province" -> DataUtil.handleProvinceData(res)
                    "city" -> DataUtil.handleCityData(res, selectedProvince.provinceId!!)
                    else -> DataUtil.handleCountyData(res, selectedCity.cityId!!)
                }

                if (result) {
                    activity!!.runOnUiThread {
                        dialog!!.dismiss()
                        when (type) {
                            "province" -> queryProvince()
                            "city" -> queryCity()
                            else -> queryCounty()
                        }
                    }
                }
            }

        })
    }

    var dialog: ProgressDialog? = null
    fun showDialog() {
        if (dialog == null) {
            dialog = ProgressDialog(activity).apply {
                setTitle("正在加载")
                setMessage("请稍后...")
            }
        }
        dialog!!.show()
    }
}