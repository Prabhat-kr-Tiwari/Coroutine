package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import kotlin.concurrent.fixedRateTimer
import kotlin.coroutines.CoroutineContext


/*fun main(): Unit = runBlocking {

//    launch(Dispatchers.Default) {
//    launch(Dispatchers.IO) {
    launch(Dispatchers.Unconfined) {

        println("first ${Thread.currentThread().name}")
        delay(1000)
        println("second ${Thread.currentThread().name}")
    }
}*/

fun main():Unit= runBlocking{

    launch(Dispatchers.Unconfined) {

        println("first ${Thread.currentThread().name}")
      val frist =  withContext(Dispatchers.IO){

            println("with context ${Thread.currentThread().name}")
            delay(100)
            return@withContext 4

        }
        println(frist)

    }

}



