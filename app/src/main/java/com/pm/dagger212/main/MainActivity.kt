package com.pm.dagger212.main

import android.os.Bundle
import com.pm.dagger212.R.layout
import com.pm.dagger212.app.AppModel
import com.pm.dagger212.app.AppModel2
import com.pm.dagger212.app.IAppModel2
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

  @Inject
  lateinit var model: MainModel
  @Inject
  lateinit var appModel: AppModel

  @Inject
  lateinit var appModel2: IAppModel2

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    model.printLogMessage()
    appModel.printLogMessage("MAIN ACTIVITY")
    appModel2.printLogMessage("MAIN ACTIVITY")
  }
}
