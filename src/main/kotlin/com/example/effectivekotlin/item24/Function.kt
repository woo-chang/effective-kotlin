package com.example.effectivekotlin.item24

fun printProcessedNumber(transition: (Int) -> Any) {
    println(transition(42))
}

val intToDouble: (Int) -> Number = { it.toDouble() }
val numberAsText: (Number) -> Any = { it.toShort() }
val identity: (Number) -> Number = { it }
val numberToInt: (Number) -> Int = { it.toInt() }
val numberHash: (Any) -> Number = { it.hashCode() }

fun main(args: Array<String>) {
    printProcessedNumber(intToDouble)
    printProcessedNumber(numberAsText)
    printProcessedNumber(identity)
    printProcessedNumber(numberToInt)
    printProcessedNumber(numberHash)
}
