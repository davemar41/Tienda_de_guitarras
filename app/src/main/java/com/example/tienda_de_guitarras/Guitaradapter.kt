package com.example.tienda_de_guitarras

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tienda_de_guitarras.databinding.GuitarrasItemBinding
import com.squareup.picasso.Picasso

class Guitaradapter(val guitarras:List<Guitarras>): RecyclerView.Adapter<Guitaradapter.guitarholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Guitaradapter.guitarholder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return guitarholder(layoutInflater.inflate(R.layout.guitarras_item,parent,false))
    }

    override fun onBindViewHolder(holder: Guitaradapter.guitarholder, position: Int) {
        holder.render(guitarras[position])


    }

    override fun getItemCount(): Int {
        return guitarras.size
    }

    class guitarholder(val view: View):RecyclerView.ViewHolder(view){
        val bind= GuitarrasItemBinding.bind(view)
        fun  render(guitarras: Guitarras){

            bind.modelorv.setText(guitarras.modelo)
            bind.tiporv.setText(guitarras.tipo)
            bind.preciorv.setText(guitarras.precio)
            Picasso.get().load(guitarras.imagen).into(bind.guitarphotorv)
            view.setOnClickListener {
                val intent=Intent(view.context,Calculo::class.java)
                var mibundle=Bundle()
                mibundle.putString("modelo",guitarras.modelo)
                mibundle.putString("tipo",guitarras.tipo)
                mibundle.putString("precio",guitarras.precio)
                mibundle.putString("imagen",guitarras.imagen)
                intent.putExtras(mibundle)
                startActivity(view.context,intent,mibundle)
            }



        }

    }

}