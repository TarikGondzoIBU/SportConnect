package com.harissapplication.app.modules.fanone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityFanoneBinding
import com.harissapplication.app.modules.editprofile.ui.EditprofileActivity
import com.harissapplication.app.modules.fanone.`data`.viewmodel.FanoneVM
import com.harissapplication.app.modules.notifications.ui.NotificationsActivity
import kotlin.String
import kotlin.Unit

class FanoneActivity : BaseActivity<ActivityFanoneBinding>(R.layout.activity_fanone) {
  private val viewModel: FanoneVM by viewModels<FanoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fanoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewEllipseTwentyEight.setOnClickListener {
      val destIntent = EditprofileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageF1c9b97df132dTwentySeven.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FANONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FanoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
