package com.learnkotlin.basic

class MarketplaceClass constructor (name: String, placement: String)
{
    // common class
    // you must declare your variables below

    val name = name
    val placement = placement
}

class MarketplaceClassOther constructor( val name: String, val placement: String, val item: String )
{
    // another way to declare parameter
    // this class is not using inheritance

    fun installMarketplace () {
        println("$name is successfully installed to your android")
    }
    fun addToCart () {
        println("$item successfully added to cart")
    }

}

open class StartupCompany (val name:String, val placement:String){
    // write open if you want this class is to be inherited

    open fun installApplication(){
        // write open if you want it to override to your child class
        println("yeay, application successfully installed !")
    }

    fun createAccount(){
        println("you are successfully registered in $name")
    }

}

class TokopediaClass(name: String, placement: String, val dominantColor: String) : StartupCompany(name, placement) {
override fun installApplication(){
    // write override if you want to using function of parent class on the child class
    super.installApplication() // also you can use the OG function of your parent class in the same time
    println("You automatically create gopay account")
}
}

class LazadaClass(name: String, val dominantColor: String, val promotion: String) : StartupCompany(name, placement = "WFH") {
    fun bonusPromo(){
        println("OMG, you got $promotion")
    }
}

fun main(args: Array<String>) {
    // ***** Classes *****

    val bukalapak = MarketplaceClassOther("Bukalapak", "Jombang", "Shampoo Lifebouy")
    println("${bukalapak.name} berada di ${bukalapak.placement}")
    bukalapak.installMarketplace()
    bukalapak.addToCart()

    println("")

    val tokopedia = TokopediaClass("Tokopedia", "Jakarta", "Green")
    println("${tokopedia.name} berada di ${tokopedia.placement} dan warna utamanya adalah ${tokopedia.dominantColor}")
    tokopedia.installApplication()
    tokopedia.createAccount()

    println("")

    val lazada = LazadaClass("Lazada", "Orange", "Gratis ongkir 5x")
    println("${lazada.name} berada di ${lazada.placement} dan warna utamanya adalah ${lazada.dominantColor}")
    lazada.installApplication()
    lazada.createAccount()
    lazada.bonusPromo()

    // ***** end *****
}