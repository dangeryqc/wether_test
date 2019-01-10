package www.yqc.com.wethertest.ui.activity

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_weather.*
import okhttp3.Call
import okhttp3.Response
import www.yqc.com.wethertest.R
import www.yqc.com.wethertest.model.Data
import www.yqc.com.wethertest.model.Weather
import www.yqc.com.wethertest.ui.adapter.DetailAdapter
import www.yqc.com.wethertest.util.HttpUtil
import java.io.IOException

class WeatherActivity : AppCompatActivity() {
    lateinit var adapter: DetailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val decorView = window.decorView
        if (Build.VERSION.SDK_INT >= 21) {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            window.statusBarColor = Color.TRANSPARENT
        }
        setContentView(R.layout.activity_weather)
        initView()

    }

    private fun initView() {
        val address = intent.getStringExtra("address")
        weather_title.text = address
        adapter = DetailAdapter()
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = linearLayoutManager
        initData(address)
    }

    private fun initData(city: String) {
        HttpUtil.sendHttpRequest("http://v.juhe.cn/weather/index?cityname=$city&key=db124717791ce34eacfcab9ee9cb45f6", object : okhttp3.Callback {
            override fun onFailure(call: Call?, e: IOException?) {

            }

            override fun onResponse(call: Call?, response: Response?) {
                val result = response?.body()?.string()
                val json = GsonBuilder().create().fromJson(result, Weather::class.java)
                val dataList = ArrayList<Data>()
                dataList.clear()
                runOnUiThread {
                    temp.text = json.result.today.temperature
                    weather_detail.text = json.result.today.weather
                    tips.text = json.result.today.dressing_advice
                    val future = json.result.future

                    val data2 = Data()
                    data2.date = future.day_20190110.date
                    data2.temp = future.day_20190110.temperature
                    data2.week = future.day_20190110.week
                    data2.detail = future.day_20190110.weather
                    dataList.add(data2)

                    val data3 = Data()
                    data3.date = future.day_20190111.date
                    data3.temp = future.day_20190111.temperature
                    data3.week = future.day_20190111.week
                    data3.detail = future.day_20190111.weather
                    dataList.add(data3)

                    val data4 = Data()
                    data4.date = future.day_20190112.date
                    data4.temp = future.day_20190112.temperature
                    data4.week = future.day_20190112.week
                    data4.detail = future.day_20190112.weather
                    dataList.add(data4)

                    val data5 = Data()
                    data5.date = future.day_20190113.date
                    data5.temp = future.day_20190113.temperature
                    data5.week = future.day_20190113.week
                    data5.detail = future.day_20190113.weather
                    dataList.add(data5)

                    val data6 = Data()
                    data6.date = future.day_20190114.date
                    data6.temp = future.day_20190114.temperature
                    data6.week = future.day_20190114.week
                    data6.detail = future.day_20190114.weather
                    dataList.add(data6)

                    val data7 = Data()
                    data7.date = future.day_20190115.date
                    data7.temp = future.day_20190115.temperature
                    data7.week = future.day_20190115.week
                    data7.detail = future.day_20190115.weather
                    dataList.add(data7)

                    val data1 = Data()
                    data1.date = future.day_20190116.date
                    data1.temp = future.day_20190116.temperature
                    data1.week = future.day_20190116.week
                    data1.detail = future.day_20190116.weather
                    dataList.add(data1)

                    adapter.data = dataList
                    recycler_view.adapter = adapter
                }
            }
        })
    }
}
