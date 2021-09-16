package com.example.tienda_de_guitarras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tienda_de_guitarras.databinding.ActivityCalculoBinding
import com.squareup.picasso.Picasso

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityCalculoBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var total:Double=0.0
        var bundle=intent.extras
        var modelo=bundle?.getString("modelo")
        var tipo=bundle?.getString("tipo")
        var precio=bundle?.getString("precio")
        var imagen=bundle?.getString("imagen")
        Picasso.get().load(imagen).into(binding.guitarfoto)
        binding.seleccion.setText(modelo+" "+tipo)
        binding.resultado.setText(precio)

        binding.button.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }




    }
}