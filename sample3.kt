package com.example.practice1.junga.kotlinpractice

open class Human (val name : String = "unknown"){

    constructor(name : String, age : Int) : this(name){
        //부생성자는 주생성자에게 위임을 받아야한다 : this(name)
        println("my name is ${name}, ${age}years old")

    }

    init { //주생성자
        println("New human had been born!")
    }

    fun eatingFood() {
        println("Yummy")
    }

    fun singASong(){
        println("오늘 달이 좋구나~~")
    }
}


class Korea : Human() { //상속 부모 클래스에 open 예약어 필요

}

fun main(){
    val Kpop = Korea()
    Kpop.singASong()
//    val human = Human("Xion")
//    val stranger = Human()
//    human.eatingFood()

    //val someone = Human("minji", 32)
    //init 먼저 실행 그 다음 constructor 실행
//    println("this human's name is ${human.name}")
}