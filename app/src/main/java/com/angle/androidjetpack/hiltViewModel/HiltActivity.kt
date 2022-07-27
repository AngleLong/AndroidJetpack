package com.angle.androidjetpack.hiltViewModel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.angle.androidjetpack.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * 这个主要是为了展示Hilt在整个MVVM中的使用
 */
@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {


//    @Inject
//    lateinit var hiltViewModel: HiltViewModel

    val hiltViewModel by lazy {
        ViewModelProvider(this)[HiltViewModel::class.java]
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)

        val userName = hiltViewModel.getUserName()
        Log.e("TAG", "onCreate: userName $userName")
    }
}