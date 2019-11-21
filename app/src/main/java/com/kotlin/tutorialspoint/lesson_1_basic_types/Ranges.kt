package com.kotlin.tutorialspoint.lesson_1_basic_types

class Ranges {
}

fun main(args: Array<String>) {
    val i: Int = 20
    for (j in 1..5)
        print("$j ")

    if(i in 1..10){// equivalent of 1 < = i && i < = 20
        println("We found your number: $i")
    }else{
        println("\nWe did not find your numer: $i")
    }
}