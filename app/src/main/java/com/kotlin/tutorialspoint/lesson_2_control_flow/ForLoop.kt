package com.kotlin.tutorialspoint.lesson_2_control_flow

class ForLoop {
}

fun main(args: Array<String>) {
    val listOfAnimals: MutableList<String> = mutableListOf("Horse", "Dog", "Cat", "Monkey")
    for (i in listOfAnimals){
        println(i)
    }

  /*  Following is another example of code, where we are using some library function to make
    our development work easier than ever before.*/

    for ((index,value) in listOfAnimals.withIndex()){
        println("The element at $index is $value")
    }
}