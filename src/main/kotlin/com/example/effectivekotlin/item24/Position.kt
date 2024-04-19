package com.example.effectivekotlin.item24

class Container<out T>(val value: T)
class Table<T>(val value: T)

fun main() {
    val containerStr: Container<String> = Container("Str")
    val containerAny: Container<Any> = containerStr

    val tableStr: Table<String> = Table("Str")
    val tableAny: Table<out Any> = tableStr
}
