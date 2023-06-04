package com.harissapplication.app.modules.myleague.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.myleague.`data`.model.MyleagueModel
import org.koin.core.KoinComponent

class MyleagueVM : ViewModel(), KoinComponent {
  val myleagueModel: MutableLiveData<MyleagueModel> = MutableLiveData(MyleagueModel())

  var navArguments: Bundle? = null
}
