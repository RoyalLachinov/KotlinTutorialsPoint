package com.kotlin.tutorialspoint.lesson_14_destructuring_decleration


/*Kotlin contains many features of other programming languages.
It allows you to declare multiple variables at once.
This technique is called Destructuring declaration.*/

data class DesDecExample(val a: String, val b: String) {
    var name: String = a
    var subject: String = b
}

fun main(args: Array<String>) {
    val s = DesDecExample("TutorialsPoint.com", "Kotlin")
    val (name, subject) = s
    println("You are learning " + subject + " form " + name)
}