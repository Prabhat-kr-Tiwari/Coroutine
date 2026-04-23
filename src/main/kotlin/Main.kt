package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*


/*fun main(): Unit {
    println("start")
    runBlocking {
        val first = getUserInfo("1", 1000)
        println(first)
        val second = getUserInfo("2", 1000)
        println(second)
    }
    println("end")
}*/
/*fun main(): Unit= runBlocking {
    println("start")
    launch{
        val first = getUserInfo("first", 1000)
        println(first)
        val second = getUserInfo("second", 1000)
        println(second)
    }
    println("end")
}*/
/*fun main(): Unit = runBlocking {
    println("start")

    val first = async {
        getUserInfo("first", 1000)
    }
    println(first.await())
    val second = async {
        getUserInfo("second", 1000)
    }
    println(second.await())

    println("end")
}*/
fun main(): Unit = runBlocking {
    println("start")

    val first = async {
        getUserInfo("first", 4000)
    }
    delay(3000)
    println(first.getCompleted())


    println("end")
}

suspend fun getUserInfo(userId: String, delay: Long): String {
    delay(delay)
    return userId;
}



