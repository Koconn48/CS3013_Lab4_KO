package edu.msudenver.cs3013.lab4_ko

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.mapsFragmentContainer, MapsFragment())
                replace(R.id.detailFragmentContainer, DetailFragment())
            }
        }
    }
}