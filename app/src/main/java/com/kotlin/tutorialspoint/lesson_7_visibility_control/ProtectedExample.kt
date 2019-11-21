package com.kotlin.tutorialspoint.lesson_7_visibility_control

open class ProtectedClass {

    protected val protectedValue = 23
}

class ChildClass : ProtectedClass(){

    fun getValue(){
        fun getValue() : Int {
            return protectedValue
        }

    }
}

fun main(args: Array<String>) {
    val publicExample:PublicExample = PublicExample()
    println(publicExample.doSomeTh())
}