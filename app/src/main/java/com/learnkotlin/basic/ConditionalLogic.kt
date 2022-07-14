package com.learnkotlin.basic

fun main() {
    // ***** Conditional Logic *****

    val n = 1
    val m = 2

    if (n == m) {
        println("n has same value with m")
    }

    if (n != m) {
        println("n not equal with m")
    }

    val accountBalance = 500000000
    val withdraw = 1200

    if(accountBalance < withdraw){
        println("Your account balance is sufficent")
    }else{
        println("Your money is will appear soon")
    }

    when (accountBalance){
        // use this to alternate switchcase or if-else

        100000 -> println("You must add more money to withdraw")
        500000 -> println("Yeay, cashback will added soon")
        else -> println("You already rich !")
    }

    // ***** end *****
}
