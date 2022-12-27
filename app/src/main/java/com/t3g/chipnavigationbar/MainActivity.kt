package com.t3g.chipnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {
    private val menu by lazy { findViewById<ChipNavigationBar>(R.id.bottom_menu) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menu.setOnItemSelectedListener { id ->
            when (id) {
                R.id.home -> {
                    Toast.makeText(applicationContext, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.activity -> {
                    Toast.makeText(applicationContext, "Activity", Toast.LENGTH_SHORT).show()
                }
                R.id.favorites -> {
                    Toast.makeText(applicationContext, "Fav", Toast.LENGTH_SHORT).show()
                }
                R.id.settings -> {
                    Toast.makeText(applicationContext, "Settings", Toast.LENGTH_SHORT).show()
                }
                else -> {}
            }
        }
    }
}