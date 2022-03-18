package com.generation.dadosdasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RolarDadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolar_dado)

        val opc = intent.getIntExtra("DADO", 0)

        val buttonRolar = findViewById<Button>(R.id.buttonRolar)

        buttonRolar.setOnClickListener {

            when (opc) {
                1 -> {
                    rolarD6(6)
                }
                2 -> {

                    rolarD12(12)
                }
                else -> {

                    rolarD20(20)
                }
            }

        }
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        buttonVoltar.setOnClickListener {
            finish()
        }
    }

    private fun dadoD6(valor: Int): Int {

        return when (valor) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6
        }
    }

    private fun rolarD6(faces: Int) {

        val valor = (1..faces).random()

        val imageResource = dadoD6(valor)

        val imageDado = findViewById<ImageView>(R.id.imageDado)

        imageDado.setImageResource(imageResource)


    }

    private fun rolarD12(faces: Int) {

        val valor = (1..faces).random()

        val imageResource = dadoD12(valor)

        val imageDado = findViewById<ImageView>(R.id.imageDado)

        imageDado.setImageResource(imageResource)

    }

    private fun dadoD12(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.d12_1
            2 -> R.drawable.d12_2
            3 -> R.drawable.d12_3
            4 -> R.drawable.d12_4
            5 -> R.drawable.d12_5
            6 -> R.drawable.d12_6
            7 -> R.drawable.d12_7
            8 -> R.drawable.d12_8
            9 -> R.drawable.d12_9
            10 -> R.drawable.d12_10
            11 -> R.drawable.d12_11
            else -> R.drawable.d12_12
        }
    }

    private fun rolarD20(faces: Int) {

        val valor = (1..faces).random()

        val imageResource = dadoD20(valor)

        val imageDado = findViewById<ImageView>(R.id.imageDado)

        imageDado.setImageResource(imageResource)
    }

    private fun dadoD20(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.d20_1
            2 -> R.drawable.d20_2
            3 -> R.drawable.d20_3
            4 -> R.drawable.d20_4
            5 -> R.drawable.d20_5
            6 -> R.drawable.d20_6
            7 -> R.drawable.d20_7
            8 -> R.drawable.d20_8
            9 -> R.drawable.d20_9
            10 -> R.drawable.d20_10
            11 -> R.drawable.d20_11
            12 -> R.drawable.d20_12
            13 -> R.drawable.d20_13
            14 -> R.drawable.d20_14
            15 -> R.drawable.d20_15
            16 -> R.drawable.d20_16
            17 -> R.drawable.d20_17
            18 -> R.drawable.d20_18
            19 -> R.drawable.d20_19
            else -> R.drawable.d20_20
        }
    }

}