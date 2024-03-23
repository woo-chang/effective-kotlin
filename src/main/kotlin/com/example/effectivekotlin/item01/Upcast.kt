package com.example.effectivekotlin.item01

data class User(val name: String)

class UserRepository {
    private val storedUsers: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): Map<Int, String> {
        // 업캐스팅
        return storedUsers
    }
}
