package com.harissapplication.app.modules.role.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RoleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSetup: String? = MyApp.getInstance().resources.getString(R.string.lbl_setup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYour: String? = MyApp.getInstance().resources.getString(R.string.lbl_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisyourro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_your_ro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_player)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCOACH: String? = MyApp.getInstance().resources.getString(R.string.lbl_coach)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_fan)

)
