package com.pm.dagger212.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pm.dagger212.R.layout
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var model: MainModel

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    model.printLogMessage()
  }
}
