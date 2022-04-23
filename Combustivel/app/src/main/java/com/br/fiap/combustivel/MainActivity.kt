package com.br.fiap.combustivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener { view : View ->
            val txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            val precoAlcool = txtAlcool.text.toString().toDouble()
            val txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            val precoGasolina = txtGasolina.text.toString().toDouble()
            val resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            }
            else if (resultado < 0.7) {
                mensagem = "Álcool "
            }
            else {
                mensagem = "Tanto faz"
            }
           var intentResultado = Intent(this, ResultadoActivity::class.java)
            intentResultado.putExtra("msg", mensagem)

            startActivity(intentResultado)
        }
    }
}