package com.pm.dagger212.main

import android.os.Bundle
import com.pm.dagger212.R.layout
import com.pm.dagger212.app.AppModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

  @Inject
  lateinit var model: MainModel
  @Inject
  lateinit var appModel: AppModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    model.printLogMessage()
    appModel.printLogMessage("MAIN ACTIVITY")
  }
}
