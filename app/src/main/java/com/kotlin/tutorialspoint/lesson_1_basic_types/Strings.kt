package com.kotlin.tutorialspoint.lesson_1_basic_types

class Strings {
}

fun main(args: Array<String>) {
    val rawString: String = "This is a raw String!"
    val escapedString: String = "This is a escaped String!\n"

    println("Hello! $escapedString")
    println("Hello! $rawString")

    //The above example of escaped String allows to provide extra line space after the first print statement.
}