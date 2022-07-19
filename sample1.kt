package com.example.practice1.junga.kotlinpractice

fun main(){
    //3. String Template
    val name = "jung"
    val lastname = "hyunjin"
    println("my name is ${name + lastname} I'm 18")

    println("is this ture? : ${1==0}") //1==0 : false / 1==1 : true

    println("this if 2\$a")
    /*여러줄
    * 주석
    */
}

//1. 함수

fun helloWorld() : Unit{ //리턴형이 없으면 Unit을 써줘야함
//void 같은 존재
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int{
    return a+b
}

//2. val VS var
//val = value

fun hi(){
    val a : Int = 10 //상수(변하지 않는 값
    var b : Int = 9 //변수

    //var e X
    //var e : Int O

    //a = 100 오류
    b = 100

    val c =100
    var d = 100

    var name = "hyunjin"
}