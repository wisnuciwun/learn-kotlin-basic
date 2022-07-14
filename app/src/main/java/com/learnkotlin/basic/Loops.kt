package com.learnkotlin.basic

fun main() {
    //***** Loops *****

    val cars = arrayListOf("Mitsubishi", "Toyota", "Mazda", "BMW")
    val cultures = hashMapOf(
        "jdm" to "Mitsubishi",
        "jdm" to "Toyota",
        "usdm" to "Muscle car of the world",
        "idm" to "Timor"
    )

    for (i in 1..5){
        // method 1

        print("*")
    }

    println("")

    for (item in cars) {
        // method 2

        println("Brand: $item")
    }

    for ((key, value) in cultures) {
        // method 3
        println("$value is one of $key")
    }

    var x = 10

    while (x > 0) {
        // method while
        println(x)
        x-- // or x = x - 1
    }

    // ***** end *****
}