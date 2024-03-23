package com.example.effectivekotlin.item01

fun main() {
    val list = listOf(1, 2, 3)

    val mutableList = list.toMutableList()
    mutableList.add(4)
    println(mutableList)

    // JVM에서 listOf는 List 인터페이스를 구현한 Arrays.ArrayList 인스턴스를 리턴한다.
    // 자바의 List 인터페이스는 add, set 메서드를 제공하기에 코틀린의 MutableList로 변경할 수 있다.
    // 하지만 Arrays.ArrayList는 연산을 구현하고 있지 않기 때문에 예외가 발생한다.
    if (list is MutableList) {
        list.add(4)
    }
}
