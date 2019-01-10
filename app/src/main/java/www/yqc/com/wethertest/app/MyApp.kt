package www.yqc.com.wethertest.app

import android.app.Application
import org.litepal.LitePal

/**
 * Created by Administrator on 2019/1/8.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        LitePal.initialize(this)
    }
}
