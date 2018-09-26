package com.pm.dagger212.main

import com.pm.dagger212.common.di.FragmentScope
import com.pm.dagger212.main.fragment.BlankFragment
import com.pm.dagger212.main.fragment.BlankModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface MainFragmentsBindingModule {
  @FragmentScope
  @ContributesAndroidInjector(modules = [BlankModule::class])
  fun contributeBlankFragment(): BlankFragment
}