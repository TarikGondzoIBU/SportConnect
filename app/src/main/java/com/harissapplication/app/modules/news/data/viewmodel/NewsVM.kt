package com.harissapplication.app.modules.news.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harissapplication.app.modules.news.`data`.model.NewsModel
import org.koin.core.KoinComponent

class NewsVM : ViewModel(), KoinComponent {
  val newsModel: MutableLiveData<NewsModel> = MutableLiveData(NewsModel())

  var navArguments: Bundle? = null
}
