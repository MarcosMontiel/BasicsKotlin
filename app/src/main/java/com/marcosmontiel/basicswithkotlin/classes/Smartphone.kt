package com.marcosmontiel.basicswithkotlin.classes

class Smartphone(number: String, private val isPrivate: Boolean = true) : Phone(number) {

    override fun showNumber() {

        if (isPrivate) {
            println("unknown number")
        } else {
            super.showNumber()
        }

    }

}
