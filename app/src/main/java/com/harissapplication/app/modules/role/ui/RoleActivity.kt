package com.harissapplication.app.modules.role.ui

import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityRoleBinding
import com.harissapplication.app.modules.favsport.ui.FavsportActivity
import com.harissapplication.app.modules.role.`data`.viewmodel.RoleVM
import kotlin.String
import kotlin.Unit

class RoleActivity : BaseActivity<ActivityRoleBinding>(R.layout.activity_role) {
  private val viewModel: RoleVM by viewModels<RoleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.roleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.image3913918778run.setOnClickListener {
      val destIntent = FavsportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image34343273fans.setOnClickListener {
      val destIntent = FavsportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePngclipartcoa.setOnClickListener {
      val destIntent = FavsportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ROLE_ACTIVITY"

  }
}
