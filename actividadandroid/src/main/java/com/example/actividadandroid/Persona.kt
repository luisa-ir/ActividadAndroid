package com.example.actividadandroid

class Persona (
    val nombre: String,
    val edad: Int,
){
    fun presentarse(){
        println("hola, soy $nombre y tengo $edad años")
    }
}
