package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cacular(view: View){
        val precoalcool = editAlcool.text.toString();
        val precogasolina = editGasolina.text.toString();
        val resultado = txtResult.text.toString();

        melhorPreco(precoalcool,precogasolina);
    }

    fun melhorPreco(al: String, gas: String){

        val a = al.toDouble();
        val g = gas.toDouble();

        val resultadoCalc = (a/g)
        if (resultadoCalc >= 7){
            txtResult.setText("Melhor usar gasolina");
        } else {
            txtResult.setText("Melhor usar alcool!")
        }
    }
}
