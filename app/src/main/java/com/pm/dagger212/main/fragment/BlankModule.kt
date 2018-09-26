package com.pm.dagger212.main.fragment

import com.pm.dagger212.common.di.FragmentScope
import dagger.Module
import dagger.Provides

@Module
class BlankModule {
  @FragmentScope
  @Provides
  fun provideModel() = BlankModel()
}