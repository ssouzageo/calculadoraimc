package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Recuperar os dados EditText;
        // 2. Criar uma varíavel e associar (=) o componente de UI<TextInputEditText>;
        // 3. Recuperar o botão da tela;
        // 4. Colocar ação no botão setonclicklistener;
        // 5. Recuperar o texto digitado no edtpeso;
        // 6. Recuperar o texto digitado no edtaltura;

        val edtpeso = findViewById<TextInputEditText>(R.id.edittex_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edittex_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {

            val peso = edtpeso.text
            val altura = edtaltura.text

            println("ação do botão geo" + peso)
            println("ação do botão geo" + altura)
        }

    }
}