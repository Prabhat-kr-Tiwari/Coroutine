package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import kotlin.concurrent.fixedRateTimer
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.cancellation.CancellationException


/*fun main():Unit= runBlocking{

    val job = launch(start = CoroutineStart.LAZY) {

        repeat(4){
            println("this is $it")
            delay(300)
        }
    }
    job.join()
    println("this is done")
}*/

/*fun main():Unit= runBlocking{

    val job = launch{

        repeat(4){
            println("this is $it")
            delay(300)
        }
    }
    job.cancel(CancellationException("this is cancellation message"))
    job.invokeOnCompletion { cause ->
        cause?.let {
            println(cause.message)
        }?:run {
            println("this is invoke on completion")
        }
    }
    println("this is done")
}*/

/*fun main():Unit = runBlocking {

    val job = launch {
        launch {
            launch {
                throw  Exception("exception")
            }
        }
    }
    job.invokeOnCompletion { cause->
        cause?.let {
            println(cause.message)
        }
    }
}*/
/*
fun main(): Unit = runBlocking {

    val job = launch {
        launch {
            println("this is 0th")
            launch {
                println("this 1th")
                launch {
                    launch {
                        println("this 2th")

                        launch {
                            println("this 3th")

                            launch {
                                println("this 4th")

                                launch {

                                    println("this is last children")

                                }
                            }
                        }

                    }

                }
            }
        }
    }
    job.cancelAndJoin()
    job.invokeOnCompletion { cause ->
        cause?.let {
            println(cause.message)
        }
    }
}
*/


/*
fun main():Unit = runBlocking {
    val job = launch {
        repeat(4){
            println("this is parent $it")
            delay(300)
        }
    }
    val job2= launch(context = job) {
        repeat(3){
            println("this is child $it")
            delay(200)
        }
    }
    job.invokeOnCompletion { cause ->
        cause?.let {
            println(it.message)
        }?:run {
            println("invoke on completion")
        }
    }
}
*/
/*
fun main():Unit = runBlocking {
    val job = launch {
        repeat(4){
            println("this is parent $it")
        }
    }
    val job2= launch(context = job) {
        repeat(3){
            println("this is child 1 $it")
            delay(200)
            throw Exception("thiugfdx")
        }
    }
    val job3= launch(context = job) {
        repeat(3){
            println("this is child 2 $it")
            delay(200)
            throw Exception("thiugfdx")
        }
    }
    job.invokeOnCompletion { cause ->
        cause?.let {
            println(it.message)
        }?:run {
            println("invoke on completion")
        }
    }
}
*/

/*
fun main():Unit = runBlocking {
    val job = launch {
        repeat(4){
            ensureActive()
            println("this is parent $it")
        }
    }
    val job2= launch(context = job) {
        repeat(3){
            println("this is child 1 $it")
            delay(200)
            println("info about parent ${job.isActive}  ${job.isCompleted}  ${job.isCancelled}")

        }
    }
    val job3= launch(context = job) {
        repeat(3){
            println("this is child 2 $it")
            delay(200)
            println("info about parent ${job.isActive}  ${job.isCompleted}  ${job.isCancelled}")
        }
    }
    job.invokeOnCompletion { cause ->
        cause?.let {
            println(it.message)
        }?:run {
            println("invoke on completion")
        }
    }
}
*/

/*
fun main():Unit = runBlocking {
    val job = SupervisorJob()
    val scope = CoroutineScope(job+Dispatchers.Default)
    val job1=scope.launch {
        repeat(4){
            println("this child 1 $it")
            delay(300)
        }
    }
    val job2=scope.launch {
        repeat(4){
            println("this child 2 $it")
            delay(300)
            throw Exception("job2 throw exception")
        }
    }
    val job3=scope.launch {
        repeat(4){
            println("this child 3 $it")
            delay(300)
        }
    }
    job.join()


    job.invokeOnCompletion { cause ->
        cause?.let {
            println(it.message)
        }?:run {
            println("invoke on completion")
        }
    }
}
*/

/*fun main():Unit = runBlocking {
    val job = SupervisorJob()
    val scope = CoroutineScope(job+Dispatchers.Default)
    val job1=launch(start = CoroutineStart.LAZY) {
        repeat(4){
            println("this child 1 $it")
            delay(300)
        }
    }
    val job2=launch(job1) {
        repeat(4){
            println("this child 2 $it")
            delay(300)
            throw Exception("job2 throw exception")
        }
    }

}*/




fun main():Unit = runBlocking  {
    println("Start")
    coroutineScope {
        launch {
            delay(100)
            println("A")
        }
        println("B")
    }
    println("End")
}







