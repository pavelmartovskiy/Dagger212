package com.pm.dagger212.app

import android.util.Log
import javax.inject.Inject


class AppModel2 @Inject constructor() : IAppModel2 {

  init {
    Log.v("[D212]", "[${hashCode()}] APP_2, Create instance()")
  }

  override fun printLogMessage() {
    Log.v("[D212]", "[${hashCode()}] APP_2, HELLO WORLD")
  }

  override fun printLogMessage(customer: String) {
    Log.v("[D212]", "[${hashCode()}] APP_2, HELLO WORLD $customer")
  }

}