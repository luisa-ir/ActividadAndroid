package com.example.actividadandroid

    class RepositorioMemoria<T> : Repositorio<T> {

        private val lista = mutableListOf<T>()

        override fun agregar(item: T) {
            lista.add(item)
        }

        override fun obtener(id: Int): T {
            return lista[id]
        }

        override fun eliminar(id: Int) {
            lista.removeAt(id)
        }

        override fun tamano(): Int {
            return lista.size
        }
    }
