package com.example.questionario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class SegundaTela: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.atictivity_segunda_tela)


        val botaoBaixo: RadioButton = findViewById(R.id.botaoBaixo)
        if (botaoBaixo.isChecked) {
            Dados.musica = 4
        }


        val botaoMeio: RadioButton = findViewById(R.id.botaoMeio)
        if (botaoMeio.isChecked) {
            Dados.musica = 3
        }

        val botaoMeioAlto: RadioButton = findViewById(R.id.botaoMeioAlto)
        if (botaoMeioAlto.isChecked) {
            Dados.musica = 2
        }

        val botaoAlto: RadioButton = findViewById(R.id.botaoAlto)
        if (botaoAlto.isChecked) {
            Dados.musica = 1
        }

        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }
    }
}




