package com.harissapplication.app.modules.myteams.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityMyteamsBinding
import com.harissapplication.app.modules.myteams.`data`.viewmodel.MyteamsVM
import kotlin.String
import kotlin.Unit

class MyteamsActivity : BaseActivity<ActivityMyteamsBinding>(R.layout.activity_myteams) {
  private val viewModel: MyteamsVM by viewModels<MyteamsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myteamsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MYTEAMS_ACTIVITY"

  }
}
