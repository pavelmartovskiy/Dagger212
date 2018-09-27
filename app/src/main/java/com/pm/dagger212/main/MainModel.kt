package com.pm.dagger212.main

import android.util.Log


class MainModel {
  fun printLogMessage() {
    Log.v("[D212]", "[${hashCode()}] MAIN ACTIVITY, HELLO WORLD")
  }
}