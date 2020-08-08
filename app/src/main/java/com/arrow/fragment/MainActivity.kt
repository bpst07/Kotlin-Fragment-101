package com.arrow.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val fragmentOneTag = "Fragment One"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add "FragmentOne" to container (Main Activity)
        // provide tag name to handle configuration changes
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, FragmentOne(), fragmentOneTag)
                    .commit()
        }
    }
}