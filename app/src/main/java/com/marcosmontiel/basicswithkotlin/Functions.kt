package com.marcosmontiel.basicswithkotlin

import kotlin.math.abs

// Void return function

fun newTopic(topic: Any) {
    println(topic)
}

// Return function

fun operation(first: Int, second: Int): Int = first + second

// Extended function

fun Int.obtainAbs(isActive: Boolean = true): Int = if (isActive) abs(this) else this
