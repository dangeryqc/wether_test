package www.yqc.com.wethertest.db

import org.litepal.crud.LitePalSupport

/**
 * Created by Administrator on 2019/1/8.
 */
class County:LitePalSupport() {
    var countyId: Int? = null
    var countyName: String? = null
    var weatherId: String? = null
    var cityId: Int? = null
}