package com.harissapplication.app.modules.setupthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.base.BaseActivity
import com.harissapplication.app.databinding.ActivitySetupthreeBinding
import com.harissapplication.app.modules.createprofile.ui.CreateprofileActivity
import com.harissapplication.app.modules.setupthree.`data`.model.Listrectanglesix1RowModel
import com.harissapplication.app.modules.setupthree.`data`.viewmodel.SetupthreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SetupthreeActivity : BaseActivity<ActivitySetupthreeBinding>(R.layout.activity_setupthree) {
  private val viewModel: SetupthreeVM by viewModels<SetupthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglesixAdapter =
    ListrectanglesixAdapter(viewModel.listrectanglesixList.value?:mutableListOf())
    binding.recyclerListrectanglesix.adapter = listrectanglesixAdapter
    listrectanglesixAdapter.setOnItemClickListener(
    object : ListrectanglesixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglesix1RowModel) {
        onClickRecyclerListrectanglesix(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixList.observe(this) {
      listrectanglesixAdapter.updateData(it)
    }
    binding.setupthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineArrowOne.setOnClickListener {
      val destIntent = CreateprofileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewEllipseSeventeen.setOnClickListener {
      val destIntent = CreateprofileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglesix(
    view: View,
    position: Int,
    item: Listrectanglesix1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETUPTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SetupthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
