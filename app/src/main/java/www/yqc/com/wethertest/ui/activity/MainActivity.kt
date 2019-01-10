package www.yqc.com.wethertest.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import www.yqc.com.wethertest.R
import www.yqc.com.wethertest.ui.fragment.ChooseFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container, ChooseFragment()).commitNowAllowingStateLoss()

    }
}
