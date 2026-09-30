package com.example.actividadandroid

interface Repositorio<T> {

    fun agregar(item: T)

    fun obtener(id: Int): T

    fun eliminar(id: Int)

    fun tamano(): Int
}