package com.diprawal.kotlinfunfacts

import kotlin.random.Random

class FactBook {
    fun getFact(): String {
        //Change textView with a new fact
        val factsArray = arrayOf("Kotlin is Open-Source. As of now Kotlin doesn’t profit from developers who use the language but it expects to make money from its Kotlin supporting core products.",
                "With Kotlin You Write Less Code. By one estimate you write at least 20% less code in Kotlin. It drastically reduces the boilerplate code. It is good with type inference.",
                "Google’s Support Gave Life To Kotlin",
                "Kotlin and Java are two very similar languages. Kotlin has 100% interoperability with Java. You can have the codes from both Java and Kotlin in the same project and they will compile perfectly",
                "Kotlin is easy to learn. It is a friendly language and can be learnt in a few hours by reading the language reference particularly if you know Java. Equipped with a lean and intuitive syntax it is designed for Java developers. ",
                "Kotlin has this edge over other languages. Its language has both object – oriented and functional constructs. It can thus be used in both Object Oriented and Functional Programming styles. ",
                "Kotlin can definitely be used for server side development. It is 100% compatible with the JVM. You can develop server side development with Kotlin while maintaining full compatibility with existing Java based technology stacks",
                "All existing Java Frameworks and Libraries can be readily used by Kotlin programs. Kotlin programs can use all the advanced frameworks too which rely on annotation processing.",
                "You can compose functions in Kotlin with extensions and operators."
        )

        val randomNumber = Random.nextInt(7)

        return factsArray[randomNumber].toString()


    }

}