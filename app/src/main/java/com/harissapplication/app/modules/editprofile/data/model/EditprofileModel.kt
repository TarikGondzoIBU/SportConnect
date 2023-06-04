package com.harissapplication.app.modules.editprofile.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditprofileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDamir: String? = MyApp.getInstance().resources.getString(R.string.lbl_damir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBegic: String? = MyApp.getInstance().resources.getString(R.string.lbl_begic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSarajevoBosni: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sarajevo_bosni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPERSONALDATA: String? = MyApp.getInstance().resources.getString(R.string.lbl_personal_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtID: String? = MyApp.getInstance().resources.getString(R.string.lbl_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRole: String? = MyApp.getInstance().resources.getString(R.string.lbl_role)

)
