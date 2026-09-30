package com.example.actividadandroid

class Video: Reproducible {
    override fun play(){
        println("reproduciendo Video")
    }
    override fun pause(){
        println("Video pausado")
    }
}