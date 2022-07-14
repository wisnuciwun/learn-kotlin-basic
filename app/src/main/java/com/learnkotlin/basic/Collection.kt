package com.learnkotlin.basic

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    // ***** Collection *****

    var carBrands = listOf("Mercedes-Benz", "Audi", "Lamborghini", "Mitsubishi", "BMW", "Toyota", "Mazda") // like mutable array
    var jdm = arrayListOf("Mitsubishi", "Toyota", "Mazda", "BMW") // free to modify

    println(carBrands.sorted())
    println(carBrands.last())
    println(carBrands.contains("Mercedes-Benz"))

    jdm.add("Nissan")
    println(jdm)

    jdm.add(0, "Daihatsu")
    println(jdm)

    println(carBrands.indexOf("BMW"))
    jdm.remove("BMW")
    println(jdm)

    val carsMap = mapOf("kdm" to listOf<String>("Hyundai", "Kia", "Doosan"), "usdm" to "GM", "jdm" to "Toyota", "usdm" to "Ford") // give custom key to value

    println(carsMap["jdm"])
    println(carsMap.get("kdm")) // one key is just one value (and could be an array)
    println(carsMap.getOrDefault("eudm", "Audi"))
    println(carsMap.values)

    val carCultures = hashMapOf("jdm" to "Mitsubishi", "jdm" to "Toyota", "usdm" to "Muscle car of the world", "idm" to "Timor")
    carCultures["jdm"] = "King of motorvehicle"
    carCultures.put("eudm", "Luxury car")
    println(carCultures)
    carCultures.remove("idm")
    println(carCultures)

    // ***** end *****
}