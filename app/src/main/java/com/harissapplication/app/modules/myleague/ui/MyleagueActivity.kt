package com.harissapplication.app.modules.myleague.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityMyleagueBinding
import com.harissapplication.app.modules.myleague.`data`.viewmodel.MyleagueVM
import kotlin.String
import kotlin.Unit

class MyleagueActivity : BaseActivity<ActivityMyleagueBinding>(R.layout.activity_myleague) {
  private val viewModel: MyleagueVM by viewModels<MyleagueVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myleagueVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MYLEAGUE_ACTIVITY"

  }
}
