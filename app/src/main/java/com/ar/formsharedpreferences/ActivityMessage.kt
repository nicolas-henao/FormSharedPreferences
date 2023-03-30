package com.ar.formsharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val campoMensaje = findViewById<TextView>(R.id.txtMensaje)

        var miBundle: Bundle?=this.intent.extras

        if (miBundle != null) {
            campoMensaje.text = "Usuario: ${miBundle.getString("User")}\nPassword:${miBundle.getString("Password")}"
        }

        val botonSalir: Button =findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}

    }

    private fun onClick() {
        finish()
    }
}