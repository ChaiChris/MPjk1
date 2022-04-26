package com.cyt

fun main() {
/*    println("Hello KT")
    Human().hello()*/
    val h = Human(74.3f,1.7f)
    println(h.bmi())
/*    var ＋ 變數 ＋ ：指定型態（一般不需指定，系統會自動選擇）
    var age : Int = 21*/
/*    var age = 20
    age = 21
    var weight = 70.3
    val name : String
    name = "Chris"*/
}

class Human (var weight: Float, var height: Float, var name: String = "") {
    init {
        println("weight is $weight")
    }
//    constructor(name: String, weight: Float, height: Float) :this(weight, height)
    fun bmi() : Float {
        val bmi = weight / (height*height)
        return bmi
    }
//上方詳細可參閱課程14章
    fun hello () {
        println("Hello Kotlin")
    }
}