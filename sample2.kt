package com.example.practice1.junga.kotlinpractice

fun main(){
//    println(maxBy(4, 7))
//    println(maxBy2(2, 5))
//    checkNum(2, 98)
//    forAndwhile()

}

//4.조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a>b){
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int, score2 : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("noting")
        //switch와 비슷한 개념이라고 보면 될 듯
    }
    var b = when(score){
        1 -> println("this is 1")
        2 -> println("this is 2")
        else -> println("noting")
    }

    when(score2){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}
//Expression VS Statment
//뭔갈 해서 값을 만들면 전자
//실행을 하도록 지시하는 문장은 후자

//5.Array and List

//Array 기본적으로 정해져 있는 사이즈가 있다. 메모리가 할당되어 있음
//1.List : 수정 불가능 2.MutableList : 수정 가능
fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "a", 3.4f)
    val list2 = listOf(4, "t", 5.7f)

    array[0] = 5 //1 -> 5
    //list[0] = 2 수정 불가능 어떤 값으로 넣을 수는 있지만 수정할 수는 없다.

    var arrayList = arrayListOf<Int>()
    arrayList.add(100)
    arrayList.add(23)


}

//6.For / while

fun forAndwhile(){
    val student = arrayListOf("james", "jenny", "cindy", "jennifer")
    for (name in student){
        println("${name}")
    }

    for((index, name) in student.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for(i in 1..10 step 2){ //2간격 1 3 5 7 9
        sum += i
    }
    println(sum)
    sum = 0



    for(i in 10 downTo 1){ //거꾸로 10 9 8 7 6...
        sum += i
    }
    println(sum)
    sum = 0

    for(i in 1 until 10){ //1~99 마지막 수는 포함하지 않음
        sum += i
    }
    println(sum)


    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

//7. Nullable / NunNull

fun nullcheck(){
    //NPE: NULL pointer Exception
    var name : String = "jin"
    var nullName : String? = null //? = null이 될수도 안될수도 있다는 뜻
}