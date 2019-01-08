package www.yqc.com.wethertest.util

import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * Created by Administrator on 2019/1/8.
 */
class HttpUtil {
    companion object {
        fun sendHttpRequest(address: String, callback: okhttp3.Callback) {
            val client = OkHttpClient()
            val request = Request.Builder().url(address).build()
            client.newCall(request).enqueue(callback)
        }
    }
}