package com.vivi.customizelistviewexample

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class ListAdapeter(private val context: Activity) : ArrayAdapter<String>(context, R.layout.custom_view_layout) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        return super.getView(position, convertView, parent)

    }
}