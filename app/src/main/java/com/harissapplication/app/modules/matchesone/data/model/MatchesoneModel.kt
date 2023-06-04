package com.harissapplication.app.modules.matchesone.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MatchesoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowingmatch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_following_match)

)
