// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main() {
    println("Enter the 3 different marks")
    val score1 = readln().toInt()
    val score2 = readln().toInt()
    val score3 = readln().toInt()
    if (score1 in 0..100 && score2 in 0..100 && score3 in 0..100){
        val total = ((score1 + score2 + score3) / 3.0).roundToInt()
        val grade = when(total) {
            in 0.. 39 -> "Fail"
            in 40..69 -> "Pass"
            in 70..100 -> "Distinction"
            else -> "Invalid range"
        }
        println("$total - $grade")
    }
    else{
        println("Invalid marks")
    }
}