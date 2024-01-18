
//https://exercism.org/tracks/kotlin/exercises/hamming
fun main() {

    println(compute("hola ana", "hela ada"))
}


fun compute(leftStrand: String, rightStrand: String): Int {
    var differences = 0
    if (leftStrand.length == rightStrand.length) {
        rightStrand.forEachIndexed { index, d ->
            if (leftStrand[index] != rightStrand[index])
                differences++
        }
        return differences
    } else {
        throw IllegalArgumentException("left and right strands must be of equal length")
    }
}
