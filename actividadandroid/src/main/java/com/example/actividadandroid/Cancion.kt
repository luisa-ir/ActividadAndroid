package com.example.actividadandroid

class Cancion: Reproducible{
    override fun play(){
        println("reproduciendo cancion")
    }
    override fun pause(){
        println("cancion pausada")
    }
}