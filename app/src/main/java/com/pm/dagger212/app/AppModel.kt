package com.pm.dagger212.app

import android.util.Log

class AppModel {
  fun printLogMessage() {
    Log.v("[D212]", " [${hashCode()}] APP, HELLO WORLD")
  }

  fun printLogMessage(customer: String) {
    Log.v("[D212]", "[${hashCode()}] APP, HELLO WORLD $customer")
  }

}