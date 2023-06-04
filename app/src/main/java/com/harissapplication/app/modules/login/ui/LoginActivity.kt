package com.harissapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivityLoginBinding
import com.harissapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.harissapplication.app.modules.register.ui.RegisterActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.txtSignUp.setOnClickListener {
        val destIntent = RegisterActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
