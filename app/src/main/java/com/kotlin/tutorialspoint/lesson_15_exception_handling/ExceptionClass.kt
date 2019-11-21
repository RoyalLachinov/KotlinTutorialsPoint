package com.kotlin.tutorialspoint.lesson_15_exception_handling

class ExceptionClass {
}

fun main(args: Array<String>) {
    try {
        val myVar:Int = 12;
        val v:String = "Tutorials point"
        v.toInt()
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handling in Kotlin")
    }
}