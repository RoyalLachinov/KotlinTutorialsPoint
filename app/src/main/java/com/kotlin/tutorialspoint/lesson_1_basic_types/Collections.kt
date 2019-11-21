package com.kotlin.tutorialspoint.lesson_1_basic_types

class Collections {
}

fun main(args: Array<String>) {
    /*
     Kotlin has two types of collection -one is immutable
     collection(which means lists, maps and sets that cannot be editable)
     and another is mutable collection(this type of collection is editable).
     */

    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val readOnlyViewList: List<Int> = numbers
    println("My mutable list is $numbers")
    println("My read only list $readOnlyViewList")
    numbers.add(numbers.size, numbers.size + 1)
    println("My mutable list after addition $numbers")
    println("My read only list $readOnlyViewList")

    println("First element of our list is ${numbers.first()}")
    println("Last element of our list is ${numbers.last()}")
    println("Even numbers of our list are ${numbers.filter { it % 2 == 0 }}")

    //Maps
    val readWriteMap: HashMap<String, Any> = hashMapOf("first" to 1, "second" to 2, "third" to 3)
    println(readWriteMap)
    println(readWriteMap["second"])

    //Sets does not contain duplicates
    val stringSets: Set<String> = setOf("1","2","3","4","4")
    println(stringSets)
}