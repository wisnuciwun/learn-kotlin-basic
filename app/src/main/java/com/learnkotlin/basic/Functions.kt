package com.learnkotlin.basic

fun main() {
    // ***** Functions *****

    fun tryingFunction() {
        // basic function

        println("Hey you could create a function bro !")
    }

    fun createSomeLine(value: Int, name: String) {
        // function with arguments

        println(name)
        for (i in 1..value) {
            print("-")
        }
    }

    fun addZero(value: Int, zeroAmount: Int): String {
        // for returning function, adding colon & returning type data is a must

        var newWord = value.toString()
        for (i in 1..zeroAmount) {
            newWord = newWord + "0"
        }
        return newWord
    }

    fun createMoodStatus(mood: String = "Happy", name: String = "Adrus") {
        // arguments with default value

        println("$name is $mood now")
    }

     tryingFunction()
     createSomeLine(8,"wisnu")

    var myNumber = addZero(129, 2)

     println(myNumber)
     println("your new number is ${addZero(129,6)}")

     createMoodStatus("mess up", "Danila")
     createMoodStatus()

    // ***** end *****
}