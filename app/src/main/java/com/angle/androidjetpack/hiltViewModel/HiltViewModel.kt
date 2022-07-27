package com.angle.androidjetpack.hiltViewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//@ViewModelScoped
//@ActivityRetainedScoped
//class HiltViewModel @Inject constructor(private val repository: HiltRepository) : ViewModel() {
//
//    fun  getUserName ():String{
//        return repository.getUserName()
//    }
//}

@HiltViewModel
class HiltViewModel @Inject constructor(private val repository: HiltRepository) : ViewModel() {
    fun  getUserName ():String{
        return repository.getUserName()
    }
}