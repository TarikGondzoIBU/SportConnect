package com.harissapplication.app.modules.createprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.createprofile.`data`.model.CreateprofileModel
import org.koin.core.KoinComponent

class CreateprofileVM : ViewModel(), KoinComponent {
  val createprofileModel: MutableLiveData<CreateprofileModel> =
      MutableLiveData(CreateprofileModel())

  var navArguments: Bundle? = null
}
