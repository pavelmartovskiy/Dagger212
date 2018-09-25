package com.pm.dagger212

import com.pm.dagger212.di.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
  @ApplicationScope
  @Provides
  fun provideModel() = AppModel()
}