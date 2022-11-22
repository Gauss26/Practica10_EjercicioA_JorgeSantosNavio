package com.example.practica10_ejercicioa_jorgesantosnavio

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AdaptadorPersonalizado : ArrayAdapter<Coches> {
    private lateinit var coches: List<Coches>

    constructor(context: Context, lista: List<Coches>)
            : super(context, R.layout.activity_adaptador_personalizado, lista){
                coches = lista

            }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val convertView = inflater.inflate(R.layout.activity_adaptador_personalizado, null)

        val textMarca = convertView.findViewById<TextView>(R.id.marca)
        val textModelo = convertView.findViewById<TextView>(R.id.modelo)

        textMarca.text = coches[position].marca
        textModelo.text = coches[position].modelo

        return convertView
    }


}