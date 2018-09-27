package com.pm.dagger212.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pm.dagger212.R
import com.pm.dagger212.app.AppModel
import com.pm.dagger212.app.AppModel2
import com.pm.dagger212.app.IAppModel2
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class BlankFragment : DaggerFragment() {

  @Inject
  lateinit var model: BlankModel

  @Inject
  lateinit var appModel: AppModel

  @Inject
  lateinit var appModel2: IAppModel2

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? { // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_blank, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    model.printLogMessage()
    appModel.printLogMessage("BLANK FRAGMENT")
    appModel2.printLogMessage("BLANK FRAGMENT")
  }

}
