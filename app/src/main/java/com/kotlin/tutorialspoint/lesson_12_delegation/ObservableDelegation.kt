package com.kotlin.tutorialspoint.lesson_12_delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/*
Observable() takes two arguments to initialize the object and returns the same
to the called function. In the following example, we will see
how to use Observable() method in order to implement delegation.
*/
class ObservableDelegation {

    var name: String by Delegates.observable("Welcome to Tutorialspoint.com") { property: KProperty<*>, old: String, new: String ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val user:ObservableDelegation = ObservableDelegation()
    user.name = "Royal"
    user.name= "Khadija"
}