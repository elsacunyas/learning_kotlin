/**
 * @link https://exercism.org/tracks/swift/exercises/freelancer-rates
 */

import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    println(dailyRateFrom(60))
    println(monthlyRateFrom(77, 10.5))
    println(workdaysIn(20000, 80, 11.0))
}

fun dailyRateFrom(hourlyRate: Int): Int {
    return hourlyRate * 8
}

fun monthlyRateFrom(hourlyRate: Int, withDiscount: Double): Int {

    return (dailyRateFrom(hourlyRate) * 22 * (1 - withDiscount / 100)).roundToInt()

    /*val dailyRate = dailyRaterFrom(hourlyRate)
    val dailyDiscount = dailyRate * withDiscount/100
    val dailyRateWithDiscount = dailyRate-dailyDiscount
    return (dailyRateWithDiscount * 22).roundToInt()*/
}

fun workdaysIn(budget: Int, hourlyRate: Int, withDiscount: Double): Int {
    val dailyRate = dailyRateFrom(hourlyRate)
    val dailyDiscount = dailyRate * withDiscount / 100
    val dailyRateWithDiscount = dailyRate - dailyDiscount
    return floor(budget / dailyRateWithDiscount).toInt()
}