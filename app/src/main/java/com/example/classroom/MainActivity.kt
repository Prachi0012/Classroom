package com.example.classroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.classroom.fragment.Navigationdrawer

class MainActivity : AppCompatActivity() {
    lateinit var menu : ImageView
    lateinit var drawer_layout: DrawerLayout
    lateinit var nav: Navigationdrawer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    private fun initview() {
        menu=findViewById(R.id.menu)
        drawer_layout=findViewById(R.id.drawer_layout)
//        nav=findViewById(R.id.nav)
        menu.setOnClickListener {
            drawer_layout.openDrawer(GravityCompat.START)
        }
    }
}