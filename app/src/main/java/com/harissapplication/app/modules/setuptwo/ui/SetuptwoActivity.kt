package com.harissapplication.app.modules.setuptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivitySetuptwoBinding
import com.harissapplication.app.modules.setupthree.ui.SetupthreeActivity
import com.harissapplication.app.modules.setuptwo.`data`.viewmodel.SetuptwoVM
import kotlin.String
import kotlin.Unit

class SetuptwoActivity : BaseActivity<ActivitySetuptwoBinding>(R.layout.activity_setuptwo) {
  private val viewModel: SetuptwoVM by viewModels<SetuptwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.setuptwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageD0db51bfb879736.setOnClickListener {
      val destIntent = SetupthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SETUPTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SetuptwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
