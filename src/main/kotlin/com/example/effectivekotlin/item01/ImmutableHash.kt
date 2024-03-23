package com.example.effectivekotlin.item01

import java.util.SortedSet
import java.util.TreeSet

class FullName(
    var name: String,
    val next: String,
) : Comparable<FullName> {
    override fun compareTo(other: FullName): Int {
        val nameCompare = name.compareTo(other.name)
        if (nameCompare != 0) {
            return nameCompare
        }
        return next.compareTo(other.next)
    }
}

class Names {
    var names = listOf<FullName>()
        private set
}

fun main() {
    val names: SortedSet<FullName> = TreeSet()
    val person = FullName("AAA", "AAA")
    names.add(person)
    names.add(FullName("Jordan", "Hansen"))
    names.add(FullName("David", "Blanc"))

    println(names)
    println(person in names)

    person.name = "ZZZ"
    println(names)
    println(person in names)
}
