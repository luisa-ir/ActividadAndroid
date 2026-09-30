package com.example.actividadandroid

enum class Nivel (val puntos: Int) {
    Bajo(10),
    Medio(50),
    Alto(100);
    fun esMayorQue(nivel: Nivel):
            Boolean{
        return puntos > nivel.puntos
    }
}