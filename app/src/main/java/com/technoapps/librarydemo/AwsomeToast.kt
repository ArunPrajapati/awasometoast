package com.technoapps.librarydemo

import android.content.Context
import android.widget.Toast

object AwsomeToast {

    fun showToast(context: Context) {
        Toast.makeText(context, "Awsome Toast", Toast.LENGTH_SHORT).show()
    }
}