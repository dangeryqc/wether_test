package www.yqc.com.wethertest.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import www.yqc.com.wethertest.R
import www.yqc.com.wethertest.model.Data

/**
 * Created by Administrator on 2019/1/9.
 */
class DetailAdapter() : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
    lateinit var data: ArrayList<Data>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return DetailViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.temp.text = data[position].temp
        holder.detail.text = data[position].detail
        holder.date.text = initDate(data[position].date!!)
        holder.week.text = data[position].week
    }

    private fun initDate(data: String): String {
        return "${data.substring(0, 4)}年${data.substring(4, 6)}月${data.substring(6)}"
    }

    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var temp = itemView.findViewById(R.id.temp) as TextView
        var detail = itemView.findViewById(R.id.detail) as TextView
        var date = itemView.findViewById(R.id.data) as TextView
        var week = itemView.findViewById(R.id.week) as TextView
    }
}