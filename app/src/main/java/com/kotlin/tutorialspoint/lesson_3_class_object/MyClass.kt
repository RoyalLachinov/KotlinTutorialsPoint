package com.kotlin.tutorialspoint.lesson_3_class_object

class MyClass {

    // property(data member)
    private var name: String = "Tutorials point"

    //member funtion
    fun printMe() {
        println("You are the best learning website named $name")
    }
}

fun main(args: Array<String>) {
    val myClass: MyClass = MyClass()
    myClass.printMe()
}