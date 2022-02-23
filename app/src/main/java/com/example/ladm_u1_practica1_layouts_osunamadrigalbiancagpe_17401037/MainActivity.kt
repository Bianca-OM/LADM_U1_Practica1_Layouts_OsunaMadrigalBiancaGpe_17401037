package com.example.ladm_u1_practica1_layouts_osunamadrigalbiancagpe_17401037

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("APP RESTAURANTE")

        btnmenu.setOnClickListener {
            llamarMenu()
        }

        btnordenar.setOnClickListener {
            llamarOrdenar()
        }
    }

    fun llamarMenu() {
        val vtnMenu = Intent(this, MainActivity2::class.java)
        startActivity(vtnMenu)
    }

    fun llamarOrdenar() {
        val vtnOrdenar = Intent(this, MainActivity3::class.java)
        startActivity(vtnOrdenar)
    }
}