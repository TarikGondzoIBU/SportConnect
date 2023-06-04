package com.harissapplication.app.modules.favsport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.favsport.`data`.model.FavsportModel
import org.koin.core.KoinComponent

class FavsportVM : ViewModel(), KoinComponent {
  val favsportModel: MutableLiveData<FavsportModel> = MutableLiveData(FavsportModel())

  var navArguments: Bundle? = null
}
