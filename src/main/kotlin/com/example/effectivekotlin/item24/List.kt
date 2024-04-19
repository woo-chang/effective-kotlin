package com.example.effectivekotlin.item24

fun append(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    val strs = mutableListOf<String>("A", "B", "C")
    //append(strs) //T는 in 한정자 위치에서 사용되므로 안전하지 않다.
    val str: String = strs[3]
    println(str)
}
