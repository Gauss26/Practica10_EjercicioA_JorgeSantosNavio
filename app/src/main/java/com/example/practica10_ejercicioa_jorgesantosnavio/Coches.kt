package com.example.practica10_ejercicioa_jorgesantosnavio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Coches (var marca: String, var modelo : String){

    override fun toString(): String {
        return "Marca: " + marca + "\nModelo: " + modelo
    }

}