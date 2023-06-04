package com.harissapplication.app.modules.setupone.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SetuponeModel(
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
  var txtSearchbyvalue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_by_value)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOPULAREVENTS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_inter_milan_goe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
