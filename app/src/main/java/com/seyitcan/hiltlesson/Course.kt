package com.seyitcan.hiltlesson

import android.util.Log
import javax.inject.Inject

class Course @Inject constructor(var phone: Phone){

    fun getCourseNumber(){
        Log.e("TAG", "Ozel kurs için numara : ${phone.number}")
    }
}