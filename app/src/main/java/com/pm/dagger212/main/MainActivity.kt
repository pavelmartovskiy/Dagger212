package com.pm.dagger212.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pm.dagger212.R
import com.pm.dagger212.R.layout
import com.pm.dagger212.app.AppModel
import com.pm.dagger212.app.AppModel2
import com.pm.dagger212.app.IAppModel2
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.view.btNewScreen
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

    this
        .findViewById<View>(R.id.btNewScreen)
        .setOnClickListener {
          startActivity(Intent(this, MainActivity::class.java))
        }

  }
}
