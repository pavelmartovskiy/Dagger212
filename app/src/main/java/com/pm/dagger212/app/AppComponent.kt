package com.pm.dagger212.app

import android.app.Application
import com.pm.dagger212.common.di.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@ApplicationScope
@Component(
    modules = [
      AndroidSupportInjectionModule::class,
      ActivitiesBindingModule::class,
      AppModule::class,
      AppModule2::class])
interface AppComponent : AndroidInjector<App> {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }

}