package com.kotlin.tutorialspoint.lesson_4_contructors

//The primary constructor can be declared at class header level as shown in the following example.
class PersonConst(val name: String, var age: Int) {

}

class HumanConst(val name: String, var age: Int) {

    /*This secondary constructor is created using the “constructor” keyword.
It is required whenever you want to create more than one constructor
in Kotlin or whenever you want to include more logic in the primary
constructor and you cannot do that because the primary constructor
may be called by some other class.*/

    //var or val keywords are not allowed in secondary constructor
    val addres: String = "Canada,Toronto "

    constructor (name: String, age: Int, addres: String) : this(name, age) {
    }

/*    Note − Any number of secondary constructors can be created,
    however, all of those constructors should call the primary constructor directly or indirectly.*/
}

fun main(args: Array<String>) {
    val personConst: PersonConst = PersonConst("Royal", 32)
    println("First name is ${personConst.name} and Age is ${personConst.age}")

    val humanConst: HumanConst = HumanConst("Royal", 32)
    println("As a human my name is ${humanConst.name}, my age is ${humanConst.age} and I live in ${humanConst.addres}")
}