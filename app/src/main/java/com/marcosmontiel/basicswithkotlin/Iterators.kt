package com.marcosmontiel.basicswithkotlin

// Si el valor es asignado en tiempo de compilación, se debe de agregar const.

const val divider: String = "====="

fun main() {
    showPersons("John", "Mary")
}

fun showPersons(vararg names: String) {

    println("$divider Foreach $divider\n")

    names.forEach { name ->
        println(name)
    }

    println("\n$divider While $divider\n")

    var index = 0
    while (index < names.size) {
        println(names[index])
        index++
    }

    println("\n===== When =====\n")

    index = names.indices.random()

    println(index)

    when (names[index]) {
        "John" -> {
            println("Es John!!")
        }
        "Mary" -> {
            println("Es Mary!!")
        }
        else -> {
            println("No")
        }
    }

}
