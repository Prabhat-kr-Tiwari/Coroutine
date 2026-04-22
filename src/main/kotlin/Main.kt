package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*


/*fun main(): Unit{

    takeOrder("Customer1")
    cookFood("Customer1")
    deliverIt("Customer1")


    takeOrder("Customer2")
    cookFood("Customer2")
    deliverIt("Customer2")

}
fun takeOrder(name: String) {
    println("Order has been taken from $name")
}

fun cookFood(name: String) {
    println("Food is cooked for $name")
    Thread.sleep(4000)
}

fun deliverIt(name: String) {
    println("food has been delivered for $name")
}*/


//usin multiple threads
//here task completed very fast as compared to first one
//but more memory
/*fun main(): Unit {

    Thread {
        takeOrder("Customer1")
        cookFood("Customer1")
        deliverIt("Customer1")
    }.start()



    Thread {
        takeOrder("Customer2")
        cookFood("Customer2")
        deliverIt("Customer2")
    }.start()


}

fun takeOrder(name: String) {
    println("Order has been taken from $name")
}

fun cookFood(name: String) {
    println("Food is cooked for $name")
    Thread.sleep(4000)
}

fun deliverIt(name: String) {
    println("food has been delivered for $name")
}*/

fun main(): Unit = runBlocking{

    launch {
        takeOrder("Customer1")
        cookFood("Customer1")
        deliverIt("Customer1")
    }




    launch {
        takeOrder("Customer2")
        cookFood("Customer2")
        deliverIt("Customer2")
    }



}

suspend fun takeOrder(name: String) {
    println("Order has been taken from $name")
}

suspend fun cookFood(name: String) {
    println("Food is cooked for $name")
    delay(4000)
}

suspend  fun deliverIt(name: String) {
    println("food has been delivered for $name")
}
