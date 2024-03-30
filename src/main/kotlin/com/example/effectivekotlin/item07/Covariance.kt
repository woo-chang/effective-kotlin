package com.example.effectivekotlin.item07

interface Alcohol
class Soju : Alcohol

interface Drinker<out T> {
    fun drink()
}

fun varianceTest(input: Drinker<Alcohol>) {
    input.drink()
}

fun main() {
    val alchol: Drinker<Alcohol> = object : Drinker<Alcohol> {
        override fun drink() {
            println("Drink!")
        }
    }
    val soju: Drinker<Soju> = object : Drinker<Soju> {
        override fun drink() {
            println("Drink Soju!")
        }
    }
    println(varianceTest(alchol))
    println(varianceTest(soju))

    val catBox: Box<Cat> = Box(Cat())
    var animalBox: Box<Animal> = catBox
    // 실제로 Cat만 담을 수 있는데, Dog를 추가하려고 시도하게 된다.
    // animalBox.put(Dog())
    val get = animalBox.get()

    val animalConsumer: Consumer<Animal> = Consumer<Animal>()
    val livingConsumer: Consumer<Cat> = animalConsumer
}

interface Animal
class Cat : Animal {
    fun cat() {
        println("CAT")
    }
}

class Dog : Animal {
    fun dog() {
        println("DOG")
    }
}

class Box<out T>(val item: T) {
    fun get(): T = item
    // T는 공변적이기 때문에 생산만 가능하고, 아래 메서드가 허용되지 않는다.
    // fun put(item: T) {}
}

class Consumer<in T> {
    fun consumer(item: T) {

    }
    // T는 반공변이기 때문에 소비만 가능하고, 아래 메서드가 허용되지 않는다.
    // 어떤 타입이 반환될지 예측할 수가 없다. 상위 타입은 호환성이 없으므로
    // fun produce() : T { ... }
}
