package com.kotlin.tutorialspoint.lesson_9_data_classes


/*
Data classes can be used to hold the basic data apart.
Other than this, it does not provide any other functionality.
All the data classes need to have one primary constructor and
all the primary constructor should have at least one parameter.

Any data class cannot have a modifier like abstract and open or internal.
Data class can be extended to other classes too.

*/

data class DataClass(val name: String, val publisher: String, var reviewScore: Int) {}

fun main(args: Array<String>) {
    val book:DataClass = DataClass("Kotlin","TutorialPoint.com",5)
    println("Name of the Book is--"+book.name) // "Kotlin"
    println("Puclisher Name--"+book.publisher) // "TutorialPoint.com"
    println("Review of the book is--"+book.reviewScore) // 5
    book.reviewScore = 7
    println("Printing all the info all together--"+book.toString())
    println("Example of the hashCode function--"+book.hashCode())
}

