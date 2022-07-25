package com.example.practice1.junga.kotlinpractice

class Human constructor(name : String){
    val name = name
    fun eatingFood() {
        println("Yummy")
    }
}

fun main(){
    val human = Human("hyun jin")
    human.eatingFood()
    println("this human name is ${human.name}")
}