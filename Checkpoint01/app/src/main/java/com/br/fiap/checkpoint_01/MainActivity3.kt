package com.br.fiap.checkpoint_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var btnCalcularAssinatura = findViewById<Button>(R.id.btnCalcularAssinatura)
        btnCalcularAssinatura.setOnClickListener { view : View ->
                val txtAssinatura = findViewById<EditText>(R.id.assinatura)
                val valorAssinatura = txtAssinatura.text.toString().toDouble()
                val txtMinutosLocal = findViewById<EditText>(R.id.minutosLocal)
                val valorMinutosLocal = txtMinutosLocal.text.toString().toDouble()
                val txtMinutosCelular = findViewById<EditText>(R.id.minutosCelular)
                val valorMinutosCelular = txtMinutosCelular.text.toString().toDouble()
                val soma = valorAssinatura + valorMinutosLocal + valorMinutosCelular
                var somaValor = soma.toString()
                var msg = "Assinatura: ${assinatura.text}" +
                        "\nChamada Local: ${minutosLocal.text}" +
                        "\nChamada Celular: ${minutosCelular.text}" +
                        "\n\nTotal: ${somaValor}"
                    var intentResultado = Intent(this, MainActivity4::class.java)
                intentResultado.putExtra("msg", msg)
                startActivity(intentResultado)
            }
        }
    }