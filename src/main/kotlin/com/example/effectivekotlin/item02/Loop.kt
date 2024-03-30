package com.example.effectivekotlin.item02

fun main() {
    val list = listOf(1, 2, 3, 4)
    for (item in list) {
        println("[ITEM]: $item")
        if (item % 2 == 0) {
            println("[EVEN ITEM]: $item")
            val mapped = item * 11
            println("[MAPPED ITEM]: $mapped")
        }
    }
}
