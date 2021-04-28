package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class SunnyWeatherApplication :Application()
{
    companion object {
        const val TOKEN = "uCr0jDPwxzNxqmwv"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}