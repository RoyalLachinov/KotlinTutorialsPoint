package com.kotlin.tutorialspoint.lesson_7_visibility_control

class InternalExample {

    internal val i = 23;
    internal fun internalFunc() = "I am an internal funtion"
}

class InternalImpl() {
    fun getInternalValue() {
        val internalExample: InternalExample = InternalExample()

        println("${internalExample.i} " + internalExample.internalFunc())
    }
}