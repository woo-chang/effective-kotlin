package com.example.effectivekotlin.item01

val name: String? = "Marton"
val surname: String = "Braun"

val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }

fun main() {
    if (fullName != null) {
        // 게터로 정의하면 사용 시점에 따라 다른 결과가 나올 수 있어 스마트 캐스트 불가능
        // println(fullName.length)
    }

    if (fullName2 != null) {
        println(fullName2.length)
    }
}
