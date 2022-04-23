package com.br.fiap.combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val txtResultado = findViewById<TextView>(R.id.lbResultado)
        txtResultado.text =  intent.getStringExtra("msg")
    }
}