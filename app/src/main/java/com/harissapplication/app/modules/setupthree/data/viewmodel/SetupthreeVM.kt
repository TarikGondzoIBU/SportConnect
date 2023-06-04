package com.harissapplication.app.modules.setupthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.setupthree.`data`.model.Listrectanglesix1RowModel
import com.harissapplication.app.modules.setupthree.`data`.model.SetupthreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SetupthreeVM : ViewModel(), KoinComponent {
  val setupthreeModel: MutableLiveData<SetupthreeModel> = MutableLiveData(SetupthreeModel())

  var navArguments: Bundle? = null

  val listrectanglesixList: MutableLiveData<MutableList<Listrectanglesix1RowModel>> =
      MutableLiveData(mutableListOf())
}
