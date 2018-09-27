package com.pm.dagger212.app

import com.pm.dagger212.common.di.ApplicationScope
import dagger.Binds
import dagger.Module

@Module
interface AppModule2 {
  @Binds
  @ApplicationScope
  fun provideModel(appModel2: AppModel2): IAppModel2
}