package com.br.fiap.checkpoint_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener { view: View ->
            val txtValor1 = findViewById<EditText>(R.id.valor1)
            val valor1 = txtValor1.text.toString().toDouble()
            val txtValor2 = findViewById<EditText>(R.id.valor2)
            val valor2 = txtValor2.text.toString().toDouble()

            if (soma.isChecked()) {
                val contaSoma = valor1 + valor2
                Toast.makeText(this, "${contaSoma}", Toast.LENGTH_SHORT).show()
            } else if (subtracao.isChecked()) {
                val contaSubtracao = valor1 - valor2
                Toast.makeText(this, "${contaSubtracao}", Toast.LENGTH_SHORT).show()
            } else if (multiplicacao.isChecked()) {
                val contaMultiplicacao = valor1 * valor2
                Toast.makeText(this, "${contaMultiplicacao}", Toast.LENGTH_SHORT).show()
            } else if (divisao.isChecked()) {
                val contaDivisao = valor1 / valor2
                Toast.makeText(this, "${contaDivisao}", Toast.LENGTH_SHORT).show()
            }

        }

    }

}