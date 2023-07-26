package com.marcosmontiel.basicswithkotlin.classes

data class Person(
    var age: Int = 0,
    var group: Group = Group.FAMILY,
    var groupCode: Int = 0,
    var lastName: String = "",
    var name: String = "",
)
