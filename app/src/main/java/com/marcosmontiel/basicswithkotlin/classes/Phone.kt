package com.marcosmontiel.basicswithkotlin.classes

open class Phone(private val number: String) {

    fun call() {
        println("calling...")
    }

    open fun showNumber() {
        println(number)
    }

}
