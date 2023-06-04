package com.harissapplication.app.modules.createprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityCreateprofileBinding
import com.harissapplication.app.modules.createprofile.`data`.viewmodel.CreateprofileVM
import com.harissapplication.app.modules.fanone.ui.FanoneActivity
import kotlin.String
import kotlin.Unit

class CreateprofileActivity :
    BaseActivity<ActivityCreateprofileBinding>(R.layout.activity_createprofile) {
  private val viewModel: CreateprofileVM by viewModels<CreateprofileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createprofileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linear8createprofile.setOnClickListener {
      val destIntent = FanoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATEPROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateprofileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
