package www.yqc.com.wethertest.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import www.yqc.com.wethertest.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container, ChooseFragment()).commitNowAllowingStateLoss()
//        initView()
    }

//    private fun initView() {
//        test.setOnClickListener {
//            HeWeather.getWeatherForecast(this@MainActivity, Lang.CHINESE_SIMPLIFIED, Unit.METRIC, object : HeWeather.OnResultWeatherForecastBeanListener {
//                override fun onSuccess(p0: MutableList<Forecast>?) {
//                    Log.i("Log", "onSuccess: " + Gson().toJson(p0))
//                }
//
//
//                override fun onError(p0: Throwable?) {
//                    Log.i("Log", "onError: ", p0)
//                }
//
//            })
//        }
//    }
}
