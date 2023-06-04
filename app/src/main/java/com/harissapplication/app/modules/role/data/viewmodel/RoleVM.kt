package com.harissapplication.app.modules.role.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.role.`data`.model.RoleModel
import org.koin.core.KoinComponent

class RoleVM : ViewModel(), KoinComponent {
  val roleModel: MutableLiveData<RoleModel> = MutableLiveData(RoleModel())

  var navArguments: Bundle? = null
}
