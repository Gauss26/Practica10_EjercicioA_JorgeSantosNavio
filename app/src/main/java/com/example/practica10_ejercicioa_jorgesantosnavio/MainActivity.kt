package com.example.practica10_ejercicioa_jorgesantosnavio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener{

    private lateinit var lv1 : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv1 = findViewById(R.id.lv1)

        val coches = ArrayList<Coches>()

        coches.add(Coches("Audi", "A1"))
        coches.add(Coches("Audi", "A3"))
        coches.add(Coches("Audi", "A2"))
        coches.add(Coches("Peugeot", "208"))
        coches.add(Coches("Peugeot", "308"))
        coches.add(Coches("Peugeot", "3008"))
        coches.add(Coches("Seat", "León"))
        coches.add(Coches("Seat", "Ibiza"))
        coches.add(Coches("Seat", "Toledo"))

        var adapter = AdaptadorPersonalizado(this, coches)
        lv1.adapter = adapter

        lv1.onItemClickListener = this

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var componente = ""

        if (parent?.id == R.id.lv1)
            Toast.makeText(
                this, componente + parent.adapter.getItem(
                    position
                ), Toast.LENGTH_SHORT
            ).show();

    }

}