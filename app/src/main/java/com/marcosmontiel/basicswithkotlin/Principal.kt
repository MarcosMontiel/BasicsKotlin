package com.marcosmontiel.basicswithkotlin

fun main() {

    newTopic("Hello new world")
    newTopic(operation(50, 50))

    val number = -5
    newTopic(number.obtainAbs())
    newTopic(number.obtainAbs(false))

    newTopic(addItem("7-Up", 20, 10))
    newTopic(addItem("Coca Cola", 100))
    newTopic(addItem("Pepsi"))

}
