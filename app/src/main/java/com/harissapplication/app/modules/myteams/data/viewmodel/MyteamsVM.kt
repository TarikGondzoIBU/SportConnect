package com.harissapplication.app.modules.myteams.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.myteams.`data`.model.MyteamsModel
import org.koin.core.KoinComponent

class MyteamsVM : ViewModel(), KoinComponent {
  val myteamsModel: MutableLiveData<MyteamsModel> = MutableLiveData(MyteamsModel())

  var navArguments: Bundle? = null
}
