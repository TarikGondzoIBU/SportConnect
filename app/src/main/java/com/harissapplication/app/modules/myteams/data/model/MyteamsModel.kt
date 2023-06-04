package com.harissapplication.app.modules.myteams.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyteamsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyTeams: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_teams)

)
