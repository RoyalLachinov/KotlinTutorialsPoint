package com.kotlin.tutorialspoint.lesson_13_functions

class FunctionExmaple {
}
/*
Lambda Function
Lambda is a high level function that drastically reduces the boiler plate code while
declaring a function and defining the same. Kotlin allows you to define your own lambda.
In Kotlin, you can declare your lambda and pass that lambda to a function.
*/

fun main(args: Array<String>) {
    val myLambda: (String) -> Unit = { s: String -> println(s) }
    val s = "TutorialsPoint.com"
    myLambda(s)
    myFun(s, myLambda)
}


/*
Now, we can pass a lambda to another function to get our output
which makes the calling function an inline function.*/

fun myFun(s: String, lambdaFunction: (String) -> Unit) { //passing lambda
    print("Hey!! ")
    lambdaFunction(s)// call to lambda function
}