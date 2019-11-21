package com.kotlin.tutorialspoint.lesson_2_control_flow

class WhenExpression {
}

fun main(args: Array<String>) {
    val a: Int = 3

    when(a){
        1 -> println("a == 1")
        2 -> println("a == 2")
        else ->{
            println("a neither is 1 nor 2")
        }
    }

    when(a){
        1,3,4 -> println("Value of a either 1,3,4")
        else ->{
            println("a is neither 1,3 nor 4")
        }
    }
}