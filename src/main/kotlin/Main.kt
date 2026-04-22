package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*


//main routine
fun main(): Unit = runBlocking {


 /*   first()//subroutine
    second()//subroutine*/

    launch {//coroutine
        first()
    }
    launch {  //coroutine
        second()
    }
}

suspend fun first() {

    var first = 0;
    while (true) {

        println("first  ${first++}")
        delay(1000)
    }
}

suspend fun second() {

    var second = 0;
    while (true) {
        println("second  ${second++}")
        delay(2000)

    }
}

