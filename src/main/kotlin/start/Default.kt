package org.example.start

import kotlinx.coroutines.*

/*
fun  main(): Unit = runBlocking{

    launch(start = CoroutineStart.DEFAULT) {

        println("start")
        delay(4000)
        println("end")
    }
}*/
/*fun  main(): Unit = runBlocking{

//   val job = launch(start = CoroutineStart.LAZY) {
   val job = launch(start = CoroutineStart.ATOMIC) {

        println("start")
        delay(4000)
        println("end")
    }
    job.start()
}*/
/*fun  main(): Unit = runBlocking{
    val job = launch(start = CoroutineStart.ATOMIC) {
        println("start")
        delay(4000)
        println("end")
    }
    job.cancel()
}*/

fun  main(): Unit = runBlocking{
    val job = launch(start = CoroutineStart.UNDISPATCHED, context = Dispatchers.IO) {
        println("start  ${Thread.currentThread().name}")
        delay(4000)
        println("end  ${Thread.currentThread().name}")

    }

}
