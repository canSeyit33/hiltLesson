package com.seyitcan.hiltlesson

import android.util.Log
import javax.inject.Inject

class School @Inject constructor(var phone:Phone){


    fun getSchoolNumber(){
        Log.e("TAG", "Okul için numara : ${phone.number}")
    }
}