package com.generation.dadosdasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val intentRolar = Intent(this, RolarDadoActivity::class.java)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {

            intentRolar.putExtra("DADO", 1)
            startActivity(intentRolar)

        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)

        buttonD12.setOnClickListener {

            intentRolar.putExtra("DADO", 2)
            startActivity(intentRolar)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD20.setOnClickListener {

            intentRolar.putExtra("DADO", 3)
            startActivity(intentRolar)
        }

    }
}