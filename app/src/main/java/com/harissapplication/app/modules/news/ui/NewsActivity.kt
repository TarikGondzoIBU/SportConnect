package com.harissapplication.app.modules.news.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityNewsBinding
import com.harissapplication.app.modules.news.`data`.viewmodel.NewsVM
import kotlin.String
import kotlin.Unit

class NewsActivity : BaseActivity<ActivityNewsBinding>(R.layout.activity_news) {
  private val viewModel: NewsVM by viewModels<NewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NEWS_ACTIVITY"

  }
}
