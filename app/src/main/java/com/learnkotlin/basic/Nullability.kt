package com.learnkotlin.basic

fun main() {
    //***** Nullability *****

    var names: String = "Harry Styles"
    //     names = null // cannot assign as null
    println(names)
    var nullableNames: String? = "Garry Yena"
    nullableNames = null
    println(nullableNames?.length) //cannot put .length
    println(nullableNames?.length ?: -1) // elvis operator
    //    println(nullableNames!!.length) // if you certain that your variable would show a length

    // ***** end *****
}