package com.harissapplication.app.modules.createprofile.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateprofileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_we_are_creating)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleasewaitwhi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_wait_whi)

)
