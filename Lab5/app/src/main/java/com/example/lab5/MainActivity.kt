package com.example.lab5


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var Bdescargar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bdescargar = findViewById(R.id.button_descargar)
        setListeners()

    }
    private fun setListeners() {
        Bdescargar.setOnClickListener {
            try {

                startActivity(
                    Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.robtopx.geometryjump&hl=es")
                    )
                )
            } catch (ex: Exception) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.robtopx.geometryjump&hl=es")
                    )
                )
            }
        }
    }
}