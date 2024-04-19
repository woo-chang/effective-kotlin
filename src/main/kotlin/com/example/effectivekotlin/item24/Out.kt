package com.example.effectivekotlin.item24

class Cup<out T>
open class Dog
class Puppy : Dog()

fun main(args: Array<String>) {
    val cup: Cup<Dog> = Cup<Puppy>()
    //오류
    //val a: Cup<Puppy> = Cup<Dog>()
    val anys: Cup<Any> = Cup<Int>()
    //오류
    //val nothings: Cup<Nothing> = Cup<Int>()
}
