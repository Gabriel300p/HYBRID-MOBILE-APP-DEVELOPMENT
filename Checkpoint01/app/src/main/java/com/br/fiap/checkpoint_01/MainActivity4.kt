package com.br.fiap.checkpoint_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val txtResultado = findViewById<TextView>(R.id.valores)
        txtResultado.text =  intent.getStringExtra("msg")
    }
}