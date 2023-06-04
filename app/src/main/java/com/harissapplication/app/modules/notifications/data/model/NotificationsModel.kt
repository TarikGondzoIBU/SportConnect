package com.harissapplication.app.modules.notifications.`data`.model

import com.harissapplication.app.R
import com.harissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManageyournot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manage_your_not)

)
