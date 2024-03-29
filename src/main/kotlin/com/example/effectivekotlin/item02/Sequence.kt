package com.example.effectivekotlin.item02

fun findPrimes1(): List<Int> {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    return primes
}

fun findPrimes2(): List<Int> {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            println("stop")
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    return primes.take(10).toList()
}

fun findPrimes3(): List<Int> {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        var prime: Int
        while (true) {
            prime = numbers.first()
            yield(prime)
            // 4에서 drop이 발생해서 계속 순차적으로 나오게 됨.
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    return primes.take(10).toList()
}

fun main() {
    println(findPrimes1())
    println(findPrimes2())
    println(findPrimes3())
}
