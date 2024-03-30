package com.example.effectivekotlin.item05

data class Person(
    val email: String?,
)

fun sendEmail(person: Person, text: String) {
    // run은 마지막 표현식을 반환하도록 한다.
    val email = person.email ?: run {
        println("Email is Null")
        return
    }
    println("Execute")
}

fun main() {
    val person = Person(null)
    sendEmail(person, "hello")
}
