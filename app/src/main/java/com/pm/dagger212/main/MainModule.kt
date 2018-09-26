package com.pm.dagger212.main

import com.pm.dagger212.common.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainModule {
  @ActivityScope
  @Provides
  fun provideModel() = MainModel()
}