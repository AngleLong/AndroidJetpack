package com.angle.androidjetpack.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Qualifier

/**
 * 创建一个接口
 */
interface Engine {
    fun start()
    fun shutdown()
}

class GasEngine @Inject constructor() : Engine {
    override fun start() {
        println("Gas engine start.")
    }

    override fun shutdown() {
        println("Gas engine shutdown.")
    }
}

class ElectricEngine @Inject constructor() : Engine {
    override fun start() {
        println("Electric engine start.")
    }

    override fun shutdown() {
        println("Electric engine shutdown.")
    }
}


@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    @Binds
    @BindGasEngine
    abstract fun bindGasEngine(gasEngine: GasEngine): Engine

    @Binds
    @BindElectricEngine
    abstract fun bindElectricEngine(gasEngine: ElectricEngine): Engine
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class BindGasEngine

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class BindElectricEngine
