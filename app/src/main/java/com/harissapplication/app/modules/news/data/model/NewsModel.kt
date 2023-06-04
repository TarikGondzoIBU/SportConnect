package com.harissapplication.app.modules.news.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNews: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)

)
