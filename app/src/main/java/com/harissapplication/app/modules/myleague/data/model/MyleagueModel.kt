package com.harissapplication.app.modules.myleague.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyleagueModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyLeaguesand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_leagues_and)

)
