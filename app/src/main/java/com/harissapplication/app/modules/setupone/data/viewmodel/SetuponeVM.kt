package com.harissapplication.app.modules.setupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.setupone.`data`.model.ListrectanglesixRowModel
import com.harissapplication.app.modules.setupone.`data`.model.SetuponeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SetuponeVM : ViewModel(), KoinComponent {
  val setuponeModel: MutableLiveData<SetuponeModel> = MutableLiveData(SetuponeModel())

  var navArguments: Bundle? = null

  val listrectanglesixList: MutableLiveData<MutableList<ListrectanglesixRowModel>> =
      MutableLiveData(mutableListOf())
}
