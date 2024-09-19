package com.example.applanchonete

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var coxinhaEditText: TextView
    private lateinit var bebidasEditText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        coxinhaEditText = findViewById(R.id.editTextCoxinha)
        bebidasEditText = findViewById(R.id.editTextCerveja)

        val calculaButton: Button = findViewById(R.id.CalculaButton)
        calculaButton.setOnClickListener {
            calculateAndShowResult()
        }
    }

        private fun calculateAndShowResult(){
            val coxinhaInput = coxinhaEditText.text.toString()
            val bebidaInput = bebidasEditText.text.toString()
            if (coxinhaInput.isNotEmpty() && bebidaInput.isNotEmpty()){
                val coxinhaQuantity = coxinhaInput.toInt()
                val bebidaQuantity = bebidaInput.toInt()

                val intent = intent(this, ResultActivity::class.java)


            }else{}
        }

}