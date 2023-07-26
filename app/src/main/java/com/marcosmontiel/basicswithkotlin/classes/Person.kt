package com.marcosmontiel.basicswithkotlin.classes

data class Person(
    val age: Int = 0,
    val group: Group = Group.FAMILY,
    val groupCode: Int = 0,
    val lastName: String = "",
    val name: String = "",
)
