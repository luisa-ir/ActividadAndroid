package com.example.actividadandroid

class Automovil (
    val marca: String,
    val modelo: String,
    val año: Int,
){
    constructor (marca:String,modelo:String) : this(marca,modelo,2025)
}