package com.example.practice1.junga.kotlinpractice

class Human (val name : String = "unknown"){

    init { //주생성자
        println("New human had been born!")
    }

    fun eatingFood() {
        println("Yummy")
    }
}

fun main(){
    val human = Human("Xion")

    //val stranger = Human()
    human.eatingFood()
    println("this human's name is ${human.name}")
}