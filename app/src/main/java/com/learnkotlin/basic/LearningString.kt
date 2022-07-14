package com.learnkotlin.basic

import java.util.*

fun main() {
    // ***** learning string *****

    var doubles = 12.4549859988772538562659592355252352 // 64-bit
    var floats = 1231.4549859988772538562659592355252352f // 32-bit
    var longs: Long = 12423435 // 64 bit
    var longs2 = 12423435L // other way to declare type data

    val str = """
    .lay down here, and
    .hei dudeeee 
    .yes bro i can see ya
    """.trimMargin(".") // or leave it blank but use |
    val str1 = "well i can see your \"best moment\" "
    val str2 = "well i can see your \$"
    val str3 = "well i can see your \n best moment"
    val str4 = "well i can see your \t best moment"
    val str5 = "well i can see your \b best moment"

    for (char in str) {
        println(char)
    }

    var contentEqual = str2.contentEquals("well i can see your \$") // how to put dollar sign
    var contentEqual2 = str2.contains("well I", false) // true if ignore case sensitive
    val uppers = str.uppercase()
    val lowers = str.lowercase()
    val strings = str.toString()
    val subseq = str.subSequence(2, 10) // get range of string
    val age = 34
    val name = "William"
    val hairColor = "black"
    val vehicle = "Ford GT"

    println("$name has $hairColor hair and using $vehicle. Now he $age years old, and should be has ${if (age > 30) "grand child now" else "no grand child"}") // template literals
    println(uppers)

    // ***** end *****
}
