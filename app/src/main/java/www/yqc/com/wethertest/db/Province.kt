package www.yqc.com.wethertest.db

import org.litepal.crud.LitePalSupport

/**
 * Created by Administrator on 2019/1/8.
 *
 * bug记录：之前定义provinceId为id，然后和数据库的id冲突了，导致province.save()时候，id一直没保存成功
 *同理city和county也是一样的保存不成功，将id换成个变量就行了
 *
 */
class Province : LitePalSupport() {
    var provinceId: Int? = null
    var provinceName: String? = null
    var provinceCode: Int? = null
}