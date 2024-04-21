package com.example.effectivekotlin.item39

sealed class SealedValueMatcher<T> {
    abstract fun match(value: T): Boolean

    class Equal<T>(val value: T) : SealedValueMatcher<T>() {
        override fun match(value: T): Boolean = value == this.value
    }

    class NotEqual<T>(val value: T) : SealedValueMatcher<T>() {
        override fun match(value: T): Boolean = value != this.value
    }

    class EmptyList<T>() : SealedValueMatcher<T>() {
        override fun match(value: T): Boolean = value is List<*> && value.isEmpty()
    }

    class NotEmptyList<T>() : SealedValueMatcher<T>() {
        override fun match(value: T): Boolean = value is List<*> && value.isNotEmpty()
    }
}

fun <T> SealedValueMatcher<T>.reserved(): SealedValueMatcher<T> =
    when (this) {
        is SealedValueMatcher.EmptyList -> SealedValueMatcher.NotEmptyList<T>()
        is SealedValueMatcher.NotEmptyList -> SealedValueMatcher.EmptyList<T>()
        is SealedValueMatcher.Equal -> SealedValueMatcher.NotEqual(value)
        is SealedValueMatcher.NotEqual -> SealedValueMatcher.Equal(value)
    }
