package com.kotlin.tutorialspoint.lesson_12_delegation

class PropertyDelegation {

    val myVar: String by lazy {
        "Hello "
    }
}

/*
In the above piece of code, we are passing a variable “myVar” to the Lazy function,
which in return assigns the value to its object and returns the same to the main function
*/

fun main(args: Array<String>) {
    println(PropertyDelegation().myVar + " My dear friend")
}