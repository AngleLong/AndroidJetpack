package com.angle.androidjetpack.hiltViewModel

import javax.inject.Inject

class HiltRepository @Inject constructor() {
    //模拟一个请求返回相应的姓名
    fun getUserName(): String {
        return "张三"
    }
}