package org.example

import kotlin.concurrent.thread

fun main() {
//    println(getUserInfo("1"))
   /* getUserInfoCallback("1") {
        println(it)
    }*/
    getUserInfoCallback(userid = "1"){user, throwable ->

        user?.let {
            println(user)
        }
        throwable?.let {
            println(throwable.message)
        }

    }
}

fun getUserInfo(userid: String): User {
    Thread.sleep(3000)
    return User(userId = userid, "Prabhat")
}

/*
fun getUserInfoCallback(userid: String, onComplete: (User) -> Unit) {
    thread {
        Thread.sleep(3000)
        onComplete(User(userId = userid, "Prabhat"))
    }
}*/
fun getUserInfoCallback(userid: String, onComplete: (User?,Throwable?) -> Unit) {
    thread {
        Thread.sleep(3000)
        try {
            onComplete(User(userId = userid, "Prabhat"),null)
        }catch (e:Exception){
            onComplete(null,e)

        }
    }
}
