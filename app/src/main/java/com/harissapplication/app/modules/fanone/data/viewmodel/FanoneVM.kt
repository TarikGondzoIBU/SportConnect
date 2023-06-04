package com.harissapplication.app.modules.fanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.fanone.`data`.model.FanoneModel
import org.koin.core.KoinComponent

class FanoneVM : ViewModel(), KoinComponent {
  val fanoneModel: MutableLiveData<FanoneModel> = MutableLiveData(FanoneModel())

  var navArguments: Bundle? = null
}
