package com.kotlin.tutorialspoint.lesson_12_delegation

interface Base{
    fun printMe()
}

class BaseImpl(val x: Int) : Base{
    override fun printMe() {
        println("$x") //implementation of the method
    }
}
class Derived1(b: Base): Base by b // delegating the public method on the object b

fun main(args: Array<String>) {
    val b: BaseImpl = BaseImpl(10)
    Derived1(b).printMe() // prints 10 :: accessing the printMe() method
}