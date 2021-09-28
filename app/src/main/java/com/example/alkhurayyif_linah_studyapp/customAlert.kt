package com.example.alkhurayyif_linah_studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class customAlert(activity: Activity,title:String,details: String) {
  init {
      val dialogBuilder = AlertDialog.Builder(activity)
      // here we set the message of our alert dialog
      dialogBuilder.setMessage(details)
          // positive button text and action
          .setPositiveButton("OK", DialogInterface.OnClickListener {
                  dialog, id -> dialog.cancel()
          })
      // create dialog box
      val alert = dialogBuilder.create()
      alert.setTitle(title)
      // show alert dialog
      alert.show()
  }

}