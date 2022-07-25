package com.example.practice1.junga.kotlinpractice

class Human {
    val name = "hyun jin"
    fun eatingFood() {
        println("Yummy")
    }
}

fun main(){
    val human = Human()
    human.eatingFood()
    println("this human name is ${human.name}")
}