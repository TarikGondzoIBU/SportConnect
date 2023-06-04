package com.harissapplication.app.modules.editprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityEditprofileBinding
import com.harissapplication.app.modules.editprofile.`data`.viewmodel.EditprofileVM
import kotlin.String
import kotlin.Unit

class EditprofileActivity : BaseActivity<ActivityEditprofileBinding>(R.layout.activity_editprofile)
    {
  private val viewModel: EditprofileVM by viewModels<EditprofileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editprofileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDITPROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditprofileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
