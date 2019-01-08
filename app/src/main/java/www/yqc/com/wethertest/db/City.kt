package www.yqc.com.wethertest.db

import org.litepal.crud.LitePalSupport

/**
 * Created by Administrator on 2019/1/8.
 */
class City : LitePalSupport() {
    var cityId: Int? = null
    var cityName: String? = null
    var cityCode: Int? = null
    var provinceId: Int? = null

    override fun toString(): String {
        return "$cityId-----$cityName"
    }
}