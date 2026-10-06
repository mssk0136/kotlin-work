// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    println("enter the initial temp, max temp and temp increment")
    var currentTemp = readln().toFloat()
    var maxTemp = readln().toFloat()
    var tempInc = readln().toFloat()
    var fahrenTemp = cToF(currentTemp)

    while (currentTemp <= maxTemp){
        println("$currentTemp Celsius - $fahrenTemp Fahrenheit")
        currentTemp += tempInc
        fahrenTemp = cToF(currentTemp)
    }

    // Add your code here
}

fun cToF(temp: Float): Float{
    return (temp * 1.8f) + 32

}