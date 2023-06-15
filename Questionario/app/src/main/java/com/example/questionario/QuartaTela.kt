package com.example.questionario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class QuartaTela : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta_tela)


        val opcaoUm: RadioButton = findViewById(R.id.opcaoUm)
        if (opcaoUm.isChecked) {
            Dados.data = 1
        }

        val opcaoDois: RadioButton = findViewById(R.id.opcaoDois)
        if (opcaoDois.isChecked) {
            Dados.data = 2
        }

        val opcaoTres: RadioButton = findViewById(R.id.opcaoTres)
        if (opcaoTres.isChecked) {
            Dados.data = 3
        }

        val opcaoQuatro: RadioButton = findViewById(R.id.opcaoQuatro)
        if (opcaoQuatro.isChecked) {
            Dados.data = 4
        }


        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, ResultadoTela::class.java)
            startActivity(intent)
        }
    }
}

