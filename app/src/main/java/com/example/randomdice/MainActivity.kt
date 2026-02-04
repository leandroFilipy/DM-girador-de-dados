package com.example.randomdice  // <--- ESSA LINHA É A SALVAÇÃO

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar: Button = findViewById(R.id.button1)
        val imagemDado: ImageView = findViewById(R.id.dicesImage)

        botaoJogar.setOnClickListener {
            rolarDados(imagemDado)
        }
    }

    private fun rolarDados(imagem: ImageView) {
        val numero = (1..6).random()

        val novaImagem = when (numero) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imagem.setImageResource(novaImagem)
    }
}