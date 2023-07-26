package com.marcosmontiel.basicswithkotlin.classes

import com.marcosmontiel.basicswithkotlin.newTopic

fun main() {

    newTopic("\n===== Class =====\n")

    val phone = Phone("5562096529")
    phone.call()
    phone.showNumber()

    newTopic("\n===== Override =====\n")

    val smartphone = Smartphone("5512352938")
    smartphone.call()
    smartphone.showNumber()

    newTopic("\n===== Data class =====\n")

    val person = Person(
        age = 27,
        group = Group.WORK,
        groupCode = Group.WORK.ordinal,
        lastName = "Marti",
        name = "John",
    )

    val friend = person.copy(
        group = Group.FRIENDS,
        groupCode = Group.FRIENDS.ordinal,
    )

    newTopic(person)
    newTopic(friend)

}
