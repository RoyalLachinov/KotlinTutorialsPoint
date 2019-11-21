package com.kotlin.tutorialspoint.lesson_1_basic_types

class Arrays {
}

fun main(args: Array<String>) {
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    for (i in numbers) {
        print("$i ")
    }

    println("\n" + numbers[5])
}