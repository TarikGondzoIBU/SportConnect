package com.harissapplication.app.modules.fanone.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FanoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDamirbegi: String? = MyApp.getInstance().resources.getString(R.string.lbl_damir_begi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFan: String? = MyApp.getInstance().resources.getString(R.string.lbl_fan2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTEAMS: String? = MyApp.getInstance().resources.getString(R.string.lbl_teams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEVENTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_events)

)
