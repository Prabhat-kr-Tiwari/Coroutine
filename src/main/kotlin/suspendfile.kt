package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    println(getUserInfoTwo("1"))
}

suspend fun getUserInfoTwo(userId:String):User{
    delay(3000)
    return User(userId = userId, userName = "Prabhat")

}