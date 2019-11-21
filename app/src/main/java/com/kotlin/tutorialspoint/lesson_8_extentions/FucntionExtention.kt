package com.kotlin.tutorialspoint.lesson_8_extentions

/*
Using extension, we will be able to add or remove some method functionality
even without inheriting or modifying them. Extensions are resolved statistically.
It does not actually modify the existing class, but it creates a callable
function that can be called with a dot operation.
*/

class FucntionExtention {
    var skills: String = "programming"
    fun printSkills() {
        println(skills)
    }
}

fun main(args: Array<String>) {
    val functionExtention1: FucntionExtention = FucntionExtention()
    functionExtention1.skills = "Android"
    functionExtention1.printSkills()


    val functionExtention2: FucntionExtention = FucntionExtention()
    functionExtention2.skills = " iOS"

    val functionExtention3: FucntionExtention = FucntionExtention()
    functionExtention3.skills = functionExtention1.addMySkills(functionExtention2)
    functionExtention3.printSkills()
}


fun FucntionExtention.addMySkills(fucntionExtention: FucntionExtention): String {

    val function = FucntionExtention()
    function.skills = this.skills + fucntionExtention.skills
    return function.skills
}
