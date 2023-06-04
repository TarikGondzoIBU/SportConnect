package com.harissapplication.app.modules.matchesone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.matchesone.`data`.model.MatchesoneModel
import org.koin.core.KoinComponent

class MatchesoneVM : ViewModel(), KoinComponent {
  val matchesoneModel: MutableLiveData<MatchesoneModel> = MutableLiveData(MatchesoneModel())

  var navArguments: Bundle? = null
}
