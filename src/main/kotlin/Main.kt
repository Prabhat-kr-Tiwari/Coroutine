package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext


/*fun main():Unit = runBlocking {

    coroutineScope {
        launch {
            println("first")
        }
        *//*launch {
            throw Exception("Unhandle exception")
        }*//*
        launch {
            println("second")
        }
    }

    supervisorScope {
        launch {
            println("supervisorScope  first")
        }
        launch {
            throw Exception("Unhandle exception")
        }
        launch {
            println("supervisorScope   second")
        }
    }
}*/

fun main():Unit = runBlocking {

    supervisorScope {

    val dispatcher = Dispatchers.IO
    val job = Job()
    val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->

        println("${throwable.message}")

    }
    val  coroutineContext=dispatcher+coroutineExceptionHandler

    launch(context = coroutineContext) {

        throw Exception("unhandle")
    }

    }
}



