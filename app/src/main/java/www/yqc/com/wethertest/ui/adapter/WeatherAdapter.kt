package www.yqc.com.wethertest.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import www.yqc.com.wethertest.R

/**
 * Created by Administrator on 2019/1/8.
 *
 * setAdapter之后才会走viewholder一系列方法
 */
class WeatherAdapter : RecyclerView.Adapter<WeatherAdapter.WeatherHolder>() {
    lateinit var data: ArrayList<String>
    lateinit var listener: itemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return WeatherHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: WeatherHolder, position: Int) {
        holder.itemName.text = data.get(position)
        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    inner class WeatherHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemName = itemView.findViewById(R.id.item_name) as TextView
    }

    interface itemClickListener {
        fun onItemClick(position: Int)
    }
}