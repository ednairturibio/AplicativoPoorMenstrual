package com.example.aplicativopoormenstrual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aplicativopoormenstrual.databinding.ActivityQuintaTelaBinding

class QuintaTela : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityQuintaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuintaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.voltar)
            trocartela()

    }

    private fun trocartela() {

        startActivity(Intent(this, MainActivity::class.java))
    }
}