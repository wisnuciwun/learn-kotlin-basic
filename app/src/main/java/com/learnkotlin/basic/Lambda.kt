package com.learnkotlin.basic

fun main() {
    // ***** Lambda *****

    val printSomeMessage = { message: String -> println(message) } // basic pattern
    printSomeMessage("hi guys")

    val sum = { a: Int, b: Int -> a + b } // lambda with function
    println(sum(1, 8))

    val sumOther: (Int, Int) -> Int = { a, b -> a + b } // lambda with assigned type data function
    println(sumOther(90, 7))

    fun dummyDownload(url: String, finish: () -> Unit) {
        // Unit is return nothing in kotlin
        // here is simulate a download req
        // and assuming we got a data
        // and no network error

        finish()
    }

    dummyDownload("youtube.com") {
        println("Loading....")
    }

    fun dummyDownloadTokopedia(url: String, finish: (MarketplaceClassOther) -> Unit) {
        // assuming we sent download request
        // and got a data

        val tokopedia = MarketplaceClassOther("Tokopedia", "Jakarta", "Handuk Jonson & jonson")
        finish(tokopedia)
    }

    dummyDownloadTokopedia("tokopedia.com") {
        // use simply it variable if you just have one class obj

        println("${it.name} berada di ${it.placement} dan warna utamanya adalah ${it.item}")
    }

    dummyDownloadTokopedia("tokopedia.com") { topped ->
        // use named result if you have more than one class object

        println("${topped.name} berada di ${topped.placement} dan warna utamanya adalah ${topped.item}")
    }

    fun dummyDownloadLazada(url: String, finish: (LazadaClass?, Boolean) -> Unit) {
        // assuming we sent download request
        // and got a data

        val webRequestSuccess = false
        if (webRequestSuccess) {
            val lazada = LazadaClass("Lazada", "Orange", "Gratis ongkir 10x")
            finish(lazada, true)
        } else {
            finish(null, false)
        }
    }

    dummyDownloadLazada("lazada.com") { lazda, result ->
        println("")
        println("${lazda?.name} berada di ${lazda?.placement} dan anda berhak mendapat ${lazda?.promotion}")
        // sample of line 38 rule

        if (result) {
            println("yeay you are successfully registered on Lazada")
        } else {
            println("download failed, something wrong")
        }
    }

    // ***** end *****
}