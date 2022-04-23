package com.br.fiap.checkpoint_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculadora.setOnClickListener {
            var intentResultado = Intent(this, MainActivity2::class.java)
            startActivity(intentResultado)
        }
        btnConta.setOnClickListener {
            var intentResultado2 = Intent(this, MainActivity3::class.java)
            startActivity(intentResultado2)
        }
        btnIntegrantes.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Desenvolvido por")
            builder.setMessage("Gabriel Andrade Pereira")
            builder.setPositiveButton("Ok"){dialog, which ->
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }


}