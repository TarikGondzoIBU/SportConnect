package com.harissapplication.app.modules.itemfantwo.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemFantwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDamirbegic: String? = MyApp.getInstance().resources.getString(R.string.lbl_damir_begic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMatches: String? = MyApp.getInstance().resources.getString(R.string.lbl_matches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEvents: String? = MyApp.getInstance().resources.getString(R.string.lbl_events2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTeams: String? = MyApp.getInstance().resources.getString(R.string.lbl_teams2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeaturedEvents: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_featured_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNews: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)

)
