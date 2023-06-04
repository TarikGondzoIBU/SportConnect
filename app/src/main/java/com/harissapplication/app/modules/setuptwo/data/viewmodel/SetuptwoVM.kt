package com.harissapplication.app.modules.setuptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.setuptwo.`data`.model.SetuptwoModel
import org.koin.core.KoinComponent

class SetuptwoVM : ViewModel(), KoinComponent {
  val setuptwoModel: MutableLiveData<SetuptwoModel> = MutableLiveData(SetuptwoModel())

  var navArguments: Bundle? = null
}
