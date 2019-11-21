package com.kotlin.tutorialspoint.lesson_3_class_object


interface Human{
    fun think()
}
class AnonymousInnerClass {

    //The concept of creating an object of interface using runtime object reference is known as anonymous class
}

fun main(args: Array<String>) {
    var programmer: Human = object :Human{
        override fun think() {
            println("I am an example of Anonymous Inner Class ")
        }

    }
    programmer.think()
}