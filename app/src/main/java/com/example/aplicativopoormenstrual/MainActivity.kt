package com.example.aplicativopoormenstrual

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativopoormenstrual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editCad.setOnClickListener(this)
        binding.editDoe.setOnClickListener(this)
        binding.editInf.setOnClickListener(this)
        binding.editReturn.setOnClickListener(this)
        binding.editOng.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.edit_inf) {
            segundaTela(tela = 5)
        } else if (view.id == R.id.edit_cad) {
            segundaTela(tela = 4)
        } else if (view.id == R.id.edit_doe) {
            segundaTela(tela = 3)
        } else if (view.id == R.id.edit_ong) {
            segundaTela(tela = 2)
        } else if (view.id == R.id.edit_return) {
            segundaTela(tela = 1)
        }
    }

    private fun segundaTela(tela: Int) {

        if (tela == 2) {
            startActivity(Intent(this, SegundaTela::class.java))
        } else if (tela == 3) {
            startActivity(Intent(this, TerceiraTela::class.java))
        } else if (tela == 4) {
            startActivity(Intent(this, QuartaTela::class.java))
        } else if (tela == 5) {
            startActivity(Intent(this, QuintaTela::class.java))
        } else if (tela == 1) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}