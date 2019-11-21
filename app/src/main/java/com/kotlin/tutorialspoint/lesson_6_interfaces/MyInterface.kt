package com.kotlin.tutorialspoint.lesson_6_interfaces


/*In Kotlin, the interface works exactly similar to Java 8,
which means they can contain method implementation
as well as abstract methods declaration.*/

interface MyInterface {

    var myVar:String //abstract property
    fun abcMethod() // abstract method
    fun sayHello() = "Hello dear" // method with default implementation

    fun hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }

}

//In Kotlin we can implement more than one interface but not class
class InterfaceImpl : MyInterface {
    override var myVar: String
        get() = "I'm a String"
        set(value) {}

    override fun abcMethod() {
       println("This is abc method")
    }

}

fun main(args: Array<String>) {
    val interfaceImpl:InterfaceImpl = InterfaceImpl()
    println(interfaceImpl.myVar)
    interfaceImpl.abcMethod()
    interfaceImpl.hello()
    interfaceImpl.sayHello()

}