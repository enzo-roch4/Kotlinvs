package com.example.applanchonete

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {
    private lateinit var resultadoTextView: TextView
    private lateinit var voltarButton: Button
    private lateinit var coxinhaQuantidadeTextView: TextView
    private lateinit var bebidaQuantidadeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultadoTextView = findViewById(R.id.textViewTotal)
        voltarButton = findViewById(R.id.buttonResult)
        coxinhaQuantidadeTextView = findViewById(R.id.textViewCoxinhaResult)
        bebidaQuantidadeTextView = findViewById(R.id.textViewCervejaResult)

        val coxinhaQuantitidade = intent.getIntExtra(lblCoxinha,0)
        val bebidaQuantitidade = intent.getIntExtra(lblBebida,0)

        val total = calculaTotal(coxinhaQuantitidade,bebidaQuantitidade)

        resultadoTextView.text = "Total a pagar R$ $total"
        coxinhaQuantidadeTextView.text = "Quantidade de coxinha: $coxinhaQuantitidade"
        bebidaQuantidadeTextView.text = "Quantidade de bebida: $bebidaQuantitidade"

        voltarButton.setOnClickListener{
            finish()
        }


    }
    private fun calculaTotal(coxinhaQuantidade: Int,bebidaQuantidade: Int ): Double {
        val coxinhaPrice = 10.0
        val bebidaPrice = 15.0
        val taxaService = 0.10

        val totalCoxinha = coxinhaQuantidade = coxinhaPrice
        val totalBebeida = bebidaQuantidade = bebidaPrice
        val subtotal =totalCoxinha + totalBebeida
        val totalComTaxa = subtotal * (subtotal = taxaService)




    }
    companion object {
        const val lblCoxinha = "lbl_coxinha"
        const val lblBebida = "lbl_bebida"
    }

}