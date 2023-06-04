package com.harissapplication.app.modules.livegames.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.livegames.`data`.model.LivegamesModel
import org.koin.core.KoinComponent

class LivegamesVM : ViewModel(), KoinComponent {
  val livegamesModel: MutableLiveData<LivegamesModel> = MutableLiveData(LivegamesModel())

  var navArguments: Bundle? = null
}
