package com.mebank.views

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.mebank.R

class Progress(private var activity: Activity) {
    private lateinit var dialog: Dialog

    fun showDialog() {
        if (activity != null && !activity.isFinishing) {
            dialog = Dialog(activity)

            dialog.let {
                it.requestWindowFeature(Window.FEATURE_NO_TITLE)
                it.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                it.setCancelable(false)
                it.setCanceledOnTouchOutside(false)
                it.setContentView(R.layout.dialog_progress)
                it.show()
            }
        }
    }

    fun hideDialog() {
        if (activity != null && !activity.isFinishing) {
            dialog.dismiss()
        }
    }
}