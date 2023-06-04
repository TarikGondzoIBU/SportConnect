package com.harissapplication.app.modules.livegames.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityLivegamesBinding
import com.harissapplication.app.modules.livegames.`data`.viewmodel.LivegamesVM
import kotlin.String
import kotlin.Unit

class LivegamesActivity : BaseActivity<ActivityLivegamesBinding>(R.layout.activity_livegames) {
  private val viewModel: LivegamesVM by viewModels<LivegamesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.livegamesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVEGAMES_ACTIVITY"

  }
}
