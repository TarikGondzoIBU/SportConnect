package com.harissapplication.app.modules.favsport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityFavsportBinding
import com.harissapplication.app.modules.favsport.`data`.viewmodel.FavsportVM
import com.harissapplication.app.modules.setupone.ui.SetuponeActivity
import kotlin.String
import kotlin.Unit

class FavsportActivity : BaseActivity<ActivityFavsportBinding>(R.layout.activity_favsport) {
  private val viewModel: FavsportVM by viewModels<FavsportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.favsportVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineArrowOne.setOnClickListener {
      val destIntent = SetuponeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewEllipseSeventeen.setOnClickListener {
      val destIntent = SetuponeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FAVSPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavsportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
