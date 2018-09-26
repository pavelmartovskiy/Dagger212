package com.pm.dagger212.app

import com.pm.dagger212.common.di.ActivityScope
import com.pm.dagger212.main.MainActivity
import com.pm.dagger212.main.MainFragmentsBindingModule
import com.pm.dagger212.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivitiesBindingModule {
  @ActivityScope
  @ContributesAndroidInjector(modules = [MainModule::class, MainFragmentsBindingModule::class])
  fun contributeMainActivity(): MainActivity
}