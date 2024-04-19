package com.example.effectivekotlin.item24.variancein

class Cup<in T>
open class Dog
class Puppy() : Dog()

fun main(args: Array<String>) {
    //오류
    //val b: Cup<Dog> = Cup<Puppy>()
    val a: Cup<Puppy> = Cup<Dog>()
    //오류
    //val anys: Cup<Any> = Cup<Int>()
    val nothings: Cup<Nothing> = Cup<Int>()
}
