package com.nikita.qrexample

import android.app.Application
import com.nikita.qrexample.unit.dagger.DaggerMyComponent
import com.nikita.qrexample.unit.dagger.MyComponent
import com.nikita.qrexample.unit.dagger.MyModule


class App : Application() {

    companion object {
        lateinit var myComponent: MyComponent
    }

    override fun onCreate() {
        super.onCreate()
        myComponent = getMyComponents()
    }

    private fun getMyComponents(): MyComponent {
        return DaggerMyComponent
            .builder()
            .myModule(MyModule(this))
            .build()
    }

}