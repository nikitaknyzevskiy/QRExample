package com.nikita.qrexample.unit.dagger

import com.nikita.qrexample.unit.BasicRespository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyComponent {

    fun inject(basicRespository: BasicRespository)

}
