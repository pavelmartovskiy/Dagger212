package com.pm.dagger212

import com.pm.dagger212.di.ApplicationScope
import dagger.Component
import android.app.Application
import dagger.BindsInstance
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector


@ApplicationScope
@Component(modules = [AndroidInjectionModule::class, AppModule::class])
interface AppComponent : AndroidInjector<App> {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: Application): AppComponent.Builder

    fun build(): AppComponent
  }

}