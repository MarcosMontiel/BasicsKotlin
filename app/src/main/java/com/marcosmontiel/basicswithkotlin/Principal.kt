package com.marcosmontiel.basicswithkotlin

fun main() {
    newTopic("Hello new world")
    newTopic(operation(50, 50))

    val number = -5
    newTopic(number.obtainAbs())
    newTopic(number.obtainAbs(false))
}
