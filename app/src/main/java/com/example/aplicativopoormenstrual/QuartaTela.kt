package com.example.aplicativopoormenstrual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.Toast
import com.example.aplicativopoormenstrual.databinding.ActivityQuartaTelaBinding

class QuartaTela : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityQuartaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuartaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener(this)
        binding.nome.setOnClickListener(this)
        binding.email.setOnClickListener(this)
        binding.telefone.setOnClickListener(this)
        binding.enviar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.voltar) {
            startActivity(Intent(this, MainActivity::class.java))
        }
        if (view.id == R.id.enviar) {
            startActivity(Intent(this, SextaTela::class.java))
        }


        if (view.id == R.id.nome) {
            trocartela()
        } else if (view.id == R.id.email) {
            trocartela()
        } else if (view.id == R.id.telefone) {
            trocartela()
        }

    }

    private fun trocartela() {

        val nome = binding.nome.text.toString()
        if (nome != "") {
            startActivity(Intent(this, QuartaTela::class.java))
        } else {
            Toast.makeText(this, "Forneça um nome", Toast.LENGTH_LONG).show()
        }

        val email = binding.email.text.toString()
        if (email != "") {
            startActivity(Intent(this, QuartaTela::class.java))
        } else {
            Toast.makeText(this, "Forneça um email", Toast.LENGTH_LONG).show()
        }

        val telefone = binding.telefone.text.toString()
        if (telefone != "") {
            startActivity(Intent(this, QuartaTela::class.java))
        } else {
            Toast.makeText(this, "Forneça um telefone", Toast.LENGTH_LONG).show()
        }

    }


}