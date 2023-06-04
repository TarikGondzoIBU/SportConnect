package com.harissapplication.app.modules.setupthree.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SetupthreeModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_international_h)
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
  var etLanguageOneValue: String? = null
)
