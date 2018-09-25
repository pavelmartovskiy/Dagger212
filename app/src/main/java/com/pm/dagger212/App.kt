package com.pm.dagger212

import dagger.android.support.DaggerApplication
import javax.inject.Inject


class App : DaggerApplication() {

  @Inject
  lateinit var model:AppModel

  override fun onCreate() {
    super.onCreate()
    model.printLogMessage()
  }

  override fun applicationInjector() = DaggerAppComponent.builder()
      .application(this)
      .build()
}