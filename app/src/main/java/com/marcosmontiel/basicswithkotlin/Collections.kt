package com.marcosmontiel.basicswithkotlin

fun main() {

    newTopic("\n===== Readonly collections =====\n")

    val fruits = listOf(
        "apple",
        "banana",
        "cherry",
        "grapes",
        "mango",
        "nectarine",
        "lemon",
        "pear",
        "watermelon"
    )

    val fruit = fruits[fruits.indices.random()]

    newTopic(fruit)
    newTopic(fruits.indexOf(fruit))

    newTopic("\n===== Mutable collections =====\n")

    val foods = mutableListOf<String>()
    foods.add("pizza")
    foods.add(0, "burger")
    foods.add(0, "hot dogs")

    newTopic(foods)

    newTopic("\n===== Map =====\n")

    val technology = mutableMapOf<Int, String>()
    technology[1] = "PC"
    technology[0] = "Laptop"

    newTopic(technology)
    newTopic(technology.keys)
    newTopic(technology.values)

}