/**
 * @link https://exercism.org/tracks/swift/exercises/lasagna
 */
fun lasagna() {
    println("Lasagna")
    println(remainingMinutesInOven(30))
    println(preparationTimeInMinutes(2))
    println(totalTimeInMinutes(3, 20))
}

val EXPECTED_MINUTES_IN_OVEN = 40

fun remainingMinutesInOven(elapsedMinutes: Int): Int {
    return EXPECTED_MINUTES_IN_OVEN - elapsedMinutes
}

fun preparationTimeInMinutes(layers: Int): Int {
    return layers * 2
}

fun totalTimeInMinutes(layers: Int, elapsedMinutes: Int): Int {
    return remainingMinutesInOven(elapsedMinutes) + preparationTimeInMinutes(layers)
}