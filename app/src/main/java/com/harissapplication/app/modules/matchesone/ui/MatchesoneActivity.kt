package com.harissapplication.app.modules.matchesone.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityMatchesoneBinding
import com.harissapplication.app.modules.matchesone.`data`.viewmodel.MatchesoneVM
import kotlin.String
import kotlin.Unit

class MatchesoneActivity : BaseActivity<ActivityMatchesoneBinding>(R.layout.activity_matchesone) {
  private val viewModel: MatchesoneVM by viewModels<MatchesoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.matchesoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MATCHESONE_ACTIVITY"

  }
}
