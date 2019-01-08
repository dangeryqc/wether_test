package www.yqc.com.wethertest.app

import android.app.Application
import interfaces.heweather.com.interfacesmodule.view.HeConfig
import org.litepal.LitePal

/**
 * Created by Administrator on 2019/1/8.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        HeConfig.init("HE1901080942471240", "4137569e6c4e49eead940d57ec4bc694")
        LitePal.initialize(this)
    }
}
