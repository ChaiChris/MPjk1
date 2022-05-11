package com.cyt.kotlin
import java.util.*

fun main() {
    //userinput()
}

class Student(var name:String?, var english:Int, var math:Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +"\t" + (english+math)/2)
    }
    fun nameCheck() {
        println(name?.length)
    }
}

private fun userinput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    //var name = scanner.next()
    var name = null
    print("Please enter English grades::")
    var english = scanner.nextInt()
    print("Please enter student's grades:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

