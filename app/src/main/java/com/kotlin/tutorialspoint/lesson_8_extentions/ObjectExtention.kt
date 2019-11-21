package com.kotlin.tutorialspoint.lesson_8_extentions

class ObjectExtention {

    companion object{
        fun show(): String{
            return "I am learning Kotlin from TutorialsPoint.com"
        }
    }
}

fun main(args: Array<String>) {
    val comObject = ObjectExtention.show()
    println(comObject)
}

