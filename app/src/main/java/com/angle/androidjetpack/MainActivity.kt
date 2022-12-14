package com.angle.androidjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angle.androidjetpack.hilt.Truck
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truck.deliver()

        truck.showEngine()
    }
}