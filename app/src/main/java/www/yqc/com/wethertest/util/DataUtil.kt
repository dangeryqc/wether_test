package www.yqc.com.wethertest.util

import org.json.JSONArray
import www.yqc.com.wethertest.db.City
import www.yqc.com.wethertest.db.County
import www.yqc.com.wethertest.db.Province

/**
 * Created by Administrator on 2019/1/8.
 */
class DataUtil {
    companion object {
        fun handleProvinceData(data: String): Boolean {
            if (!data.isEmpty()) {
                val jsonArray = JSONArray(data)
                for (index in 0..(jsonArray.length() - 1)) {
                    val province = Province()
                    province.provinceName = jsonArray.getJSONObject(index).getString("name")
                    province.provinceId = jsonArray.getJSONObject(index).getInt("id")
                    province.save()
                }
                return true
            }
            return false
        }

        fun handleCityData(data: String, provinceId: Int): Boolean {
            if (!data.isEmpty()) {
                val jsonArray = JSONArray(data)
                for (index in 0..(jsonArray.length() - 1)) {
                    val city = City()
                    val result = jsonArray.getJSONObject(index)
                    city.cityId = result.getInt("id")
                    city.cityName = result.getString("name")
                    city.provinceId = provinceId
                    city.save()
                }
                return true
            }
            return false
        }

        fun handleCountyData(data: String, cityId: Int): Boolean {
            if (!data.isEmpty()) {
                val jsonArray = JSONArray(data)
                for (index in 0..(jsonArray.length() - 1)) {
                    val county = County()
                    county.countyName = jsonArray.getJSONObject(index).getString("name")
                    county.weatherId = jsonArray.getJSONObject(index).getString("weather_id")
                    county.countyId = jsonArray.getJSONObject(index).getInt("id")
                    county.cityId = cityId
                    county.save()
                }
                return true
            }
            return false

        }
    }
}