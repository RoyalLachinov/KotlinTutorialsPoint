package com.kotlin.tutorialspoint.lesson_5_inheritance


/*Everything in Kotlin is by default final, hence, we need to use the keyword “open”
in front of the class declaration to make it allowable to inherit.*/


open class ParentClass {
    open fun think() {
        println("I think whole day")
    }

    fun eat() {
        println("Today I ate eggs")
    }
}

class ChildClass : ParentClass() {
    override fun think() {
        println("I do not think whole day")
    }
}


fun main(args: Array<String>) {
    val childClass: ChildClass = ChildClass()
    childClass.think()
    childClass.eat()
}