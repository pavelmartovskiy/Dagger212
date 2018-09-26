package com.pm.dagger212.app

import com.pm.dagger212.common.di.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
  @ApplicationScope
  @Provides
  fun provideModel() = AppModel()
}