package com.kotlin.tutorialspoint.lesson_2_control_flow

class ReturnBreakContinue {
}

fun main(args: Array<String>) {

    val x: Int = 5
    println(doubleMe(x))

    println("Example of break and contiue")
    myLabel@ for (i in 1..10) {
        if (i == 5) {
            println("I am inside if block with value " + x + "\n-- hence it will close the operation")
            break@myLabel
        } else {
            println("I am inside else block with value " + i)
            continue@myLabel
        }

    }
}

fun doubleMe(d: Int): Int {
    return 5 * d
}