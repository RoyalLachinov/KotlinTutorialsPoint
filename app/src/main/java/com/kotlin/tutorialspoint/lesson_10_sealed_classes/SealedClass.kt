package com.kotlin.tutorialspoint.lesson_10_sealed_classes


/*

This type of class is used to represent a restricted class hierarchy.
A sealed class can have its own subclass but all those subclasses need to be
declared inside the same Kotlin file along with the sealed class.
In the following example, we will see how to use a sealed class.

*/


sealed class SealedClass {

    class s1:SealedClass()
    class s2:SealedClass()
    class s3:SealedClass()
}

fun main(args: Array<String>) {

    val sealedClass:SealedClass = SealedClass.s3()

    val outPut = when(sealedClass){
        is SealedClass.s1 -> "Option one has bees choseen"
        is SealedClass.s2 -> "Option two has bees choseen"
        else -> "Option three has bees choseen"
    }
    println(outPut)
}