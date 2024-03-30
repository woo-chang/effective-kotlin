package com.example.effectivekotlin.item02

fun main() {
    println("<SEQUENCE>")
    listOf(1, 2, 3, 4).asSequence()
        .filter { println("[ITEM]: $it"); it % 2 == 0 }
        .map { println("[EVEN ITEM]: $it"); it * 11 }
        .forEach { println("[MAPPED ITEM]: $it") }
}
