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

// Override function

fun addItem(name: String, quantity: Int = 0, discount: Int = 0): String =
    "Product: $name, Quantity: $quantity, Discount: $discount%"
