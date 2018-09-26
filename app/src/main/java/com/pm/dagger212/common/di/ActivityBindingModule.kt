package com.pm.dagger212.common.di

import com.pm.dagger212.main.MainActivity
import com.pm.dagger212.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBindingModule {
  @ActivityScope
  @ContributesAndroidInjector(modules = [MainModule::class])
  fun contributeMainActivity(): MainActivity
}