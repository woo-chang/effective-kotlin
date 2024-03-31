package com.example.effectivekotlin.item08

import kotlin.properties.Delegates

class LateInit {
    lateinit var property: String

    fun get(): String {
        if (::property.isInitialized) {
            return property
        }
        return "nothing"
    }
}

class LateInit2 {
    var property: Int by Delegates.notNull<Int>()
}

fun main() {
    val lateInit = LateInit()
    // 초기화하지 않으면 UninitializedPropertyAccessException이 발생
    lateInit.property = "hello"
    println(lateInit.property)

    val lateInit2 = LateInit2()
    // 초기화하지 않으면 IllegalStateException이 발생
    lateInit2.property = 10
    println(lateInit2.property)
}
