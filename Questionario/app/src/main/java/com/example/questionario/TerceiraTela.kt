package com.example.questionario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class TerceiraTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)



        val segundaOpcao: RadioButton = findViewById(R.id.segundaOpcao)
        if (segundaOpcao.isChecked) {
            Dados.preco = 1
        }

        val terceiraOpcao: RadioButton = findViewById(R.id.terceiraOpcao)
        if (terceiraOpcao.isChecked) {
            Dados.preco = 2
        }

        val quartaOpcao: RadioButton = findViewById(R.id.quartaOpcao)
        if (quartaOpcao.isChecked) {
            Dados.preco = 3
        }

        val quintaOpcao: RadioButton = findViewById(R.id.quintaOpcao)
        if (quintaOpcao.isChecked) {
            Dados.preco = 4
        }

        val botaoAvancar: Button = findViewById(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }
    }
}

