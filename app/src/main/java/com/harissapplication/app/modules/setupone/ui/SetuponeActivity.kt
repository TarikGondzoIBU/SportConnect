package com.harissapplication.app.modules.setupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivitySetuponeBinding
import com.harissapplication.app.modules.setupone.`data`.model.ListrectanglesixRowModel
import com.harissapplication.app.modules.setupone.`data`.viewmodel.SetuponeVM
import com.harissapplication.app.modules.setuptwo.ui.SetuptwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SetuponeActivity : BaseActivity<ActivitySetuponeBinding>(R.layout.activity_setupone) {
  private val viewModel: SetuponeVM by viewModels<SetuponeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglesixAdapter =
    ListrectanglesixAdapter(viewModel.listrectanglesixList.value?:mutableListOf())
    binding.recyclerListrectanglesix.adapter = listrectanglesixAdapter
    listrectanglesixAdapter.setOnItemClickListener(
    object : ListrectanglesixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglesixRowModel) {
        onClickRecyclerListrectanglesix(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixList.observe(this) {
      listrectanglesixAdapter.updateData(it)
    }
    binding.setuponeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSearchbyvalue.setOnClickListener {
      val destIntent = SetuptwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglesix(
    view: View,
    position: Int,
    item: ListrectanglesixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETUPONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SetuponeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
