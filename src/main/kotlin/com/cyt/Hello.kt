package com.cyt

fun main() {
    //println("Hello KT")
    //Human().hello()
    val h = Human()
    h.hello()
    //var ＋ 變數 ＋ ：指定型態（一般不需指定，系統會自動選擇）
    //var age : Int = 21
    var age = 20
    age = 21
    var weight = 70.3
    val name : String
    name = "Chris"
}

class Human {
    fun hello () {
        println("Hello Kotlin")
    }
}