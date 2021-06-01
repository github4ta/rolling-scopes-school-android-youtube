package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ACTIVITY_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(ACTIVITY_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ACTIVITY_TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ACTIVITY_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ACTIVITY_TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ACTIVITY_TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ACTIVITY_TAG, "onDestroy")
    }

    private companion object {
        private const val ACTIVITY_TAG = "MainActivity"
    }
}