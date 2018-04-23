package com.codekul.materialdesignlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gc.materialdesign.widgets.SnackBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SnackBar(this,"HELLO","Ok",View.OnClickListener {  })
    }
}
