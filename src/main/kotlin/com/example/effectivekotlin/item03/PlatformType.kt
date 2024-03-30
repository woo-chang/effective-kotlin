package com.example.effectivekotlin.item03

interface UserRepo {
    fun getUserName() = JavaClass().value
}

class RepoImpl : UserRepo {
    // 상위 반환 타입보다 작은 범위를 가져야 한다.
    override fun getUserName(): String? {
        return null
    }
}

fun main() {
    val userRepo: UserRepo = RepoImpl()
    val text: String = userRepo.getUserName()
}
