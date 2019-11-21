package com.kotlin.tutorialspoint.lesson_2_control_flow

class WhileAndDoWhileLoops {
}

fun main(args: Array<String>) {
    var x: Int = 0

    while (x <= 10) {
        print("$x ")
        x++
    }

    do {
        x++
        println("\nI am inside the do block-- $x")
    } while (x <= 14)
}