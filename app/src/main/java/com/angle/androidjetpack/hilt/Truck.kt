package com.angle.androidjetpack.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Qualifier


class Truck @Inject constructor(private val driver: Driver) {
    @Inject
    @BindGasEngine
    lateinit var gasEngine: Engine

    @Inject
    @BindElectricEngine
    lateinit var electricEngine: Engine

    fun deliver() {
        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo. ${driver.name} ${driver.age}")
        gasEngine.shutdown()
        electricEngine.shutdown()
    }

    fun showEngine(){
        println("发送机开始运行 ")
    }
}

class Driver @Inject constructor(@Name val name: String, @Age val age: String)

@Module
@InstallIn(ActivityComponent::class)
class NameModel {

    @Name
    @Provides
    fun driverName(): String {
        return "张三"
    }

    @Age
    @Provides
    fun driverAge(): String {
        return "18"
    }
}


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class Age

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class Name