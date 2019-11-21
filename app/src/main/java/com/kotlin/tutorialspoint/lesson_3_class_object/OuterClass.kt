package com.kotlin.tutorialspoint.lesson_3_class_object

class OuterClass {

  /*  In Kotlin, nested class is by default static,
    hence, it can be accessed without creating
    any object of that class.*/

    class NestedClass{
        fun foo() = "Hello from nested class"
    }


/*    When a nested class is marked as a “inner”, then it will be called as
    an Inner class. An inner class can be accessed by the
    data member of the outer class.*/

    inner class MyInnerClass{
        fun foo() = "Hello from Inner clasas"
    }
}

fun main(args: Array<String>) {
    val nestedClass:OuterClass.NestedClass = OuterClass.NestedClass()
    println(nestedClass.foo())

    val innerClass:OuterClass.MyInnerClass = OuterClass().MyInnerClass()
    val demo = OuterClass().MyInnerClass().foo() // calling nested class method
    println(innerClass.foo())
    println(demo)

}