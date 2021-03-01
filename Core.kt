package com.example

class Core {

    val texts:MutableList<String> = mutableListOf("Salam !","Hello World !")
    fun add (text:String):Core{
        texts.add(text)
        return this
    }
}