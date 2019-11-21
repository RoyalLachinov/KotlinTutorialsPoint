package com.kotlin.tutorialspoint.lesson_2_control_flow

class IfElse {
}

fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 6;
    val max: Int
    if(a > b){
        max = a
    }else{
        max = b
    }

    println("Max number is $max")

    val max2 = if(a > b) a else b
    println(max2)
}