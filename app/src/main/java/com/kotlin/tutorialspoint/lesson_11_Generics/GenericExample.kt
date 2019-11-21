package com.kotlin.tutorialspoint.lesson_11_Generics

class GenericExample<T>(input: T) {
    init {
        println("I am getting called with the value $input")
    }
}

/*
When we want to assign the generic type to any of its super type,
then we need to use “out” keyword, and when we want to assign
the generic type to any of its sub-type, then we need to use “in” keyword.
In the following example, we will use “out” keyword.
Similarly, we can try using “in” keyword.
*/

class GenericExample2<out T>(input: T) {
    init {
        println("I am getting called with the value $input")
    }
}


fun main() {
    var genStrType: GenericExample<String> = GenericExample<String>("String")
    var genIntType: GenericExample<Int> = GenericExample<Int>(23)

    var outGenStrType: GenericExample2<Int> = GenericExample2<Int>(10)
    var inGenIntType: GenericExample2<Double> = GenericExample2<Double>(10.00)
    println(outGenStrType)
    println(inGenIntType)

}