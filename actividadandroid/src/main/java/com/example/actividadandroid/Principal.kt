package com.example.actividadandroid
fun main() {
        /*val persona = Persona("Ana", 25)
    persona.presentarse()*/

        /*val auto = Automovil("Mazda","Mazda2")

    println("Marca: ${auto.marca}")
    println("Modelo: ${auto.modelo}")
    println("Año: ${auto.año}")*/

        /*val animales = listOf(
        Perro(),
        Gato()
    )
for (animal in animales){
    animal.hacerSonido()
    }*/
        /*val libro1 = Libro("solo tres segundos", "Paula Bombara", 2011)
    val libro2 = Libro("cien años de soledad", "Gabriel Garcia Marquez",1967)
    val libro3 = libro1.copy(año = 2025)

    println(libro1)
    println(libro2)
    println(libro3)

}*/

        /*val reproducibles = listOf(Cancion(), Video())
    for (reproducible in reproducibles){
    reproducible.play()
    reproducible.pause()
    }
}*/
        /*val repositorioString = RepositorioMemoria<String>()

        repositorioString.agregar("Hola")
        repositorioString.agregar("Kotlin")
        repositorioString.agregar("Android")

        println(repositorioString.obtener(1))
        println("Tamaño: ${repositorioString.tamano()}")

        repositorioString.eliminar(1)

        println("Tamaño después de eliminar: ${repositorioString.tamano()}")


        val repositorioLibro = RepositorioMemoria<Libro>()

        val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)
        val libro2 = Libro("El principito", "Antoine de Saint-Exupéry", 1943)

        repositorioLibro.agregar(libro1)
        repositorioLibro.agregar(libro2)

        println(repositorioLibro.obtener(0))
        println("Cantidad de libros: ${repositorioLibro.tamano()}")
    }*/
       /* val pato = Pato()
        pato.volar()
        pato.nadar()*/

       /* val numero =3
        val dia =when(numero){
                1-> DiaSemana.Lunes
                2-> DiaSemana.Martes
                3-> DiaSemana.Miercoles
                4-> DiaSemana.Jueves
                5-> DiaSemana.Viernes
                6-> DiaSemana.Sabado
                7-> DiaSemana.Domingo
                else->null
        }
        println(dia)*/

        /*for(moneda in Moneda.values()){
                println("${moneda.name}: ${moneda.simbolo}")
        }*/
        val nivel1 = Nivel.Alto
        val nivel2 = Nivel.Medio
        println(nivel1.esMayorQue(nivel2))
        println(nivel2.esMayorQue(nivel1))

}