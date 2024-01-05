fun wingsQuest() {
    //1. Define if bird gets bonus points
    println(bonusPoints(false, false))
    println(bonusPoints(false, true))
    println(bonusPoints(true, false))
    println(bonusPoints(true, true))
    //2.Define if bird scores
    println(score(false, false))
    println(score(false, true))
    println(score(true, false))
    println(score(true, true))
    //3. Define if bird loses
    println(lose(false, false))
    println(lose(false, true))
    println(lose(true, false))
    println(lose(true, true))

    println(win(false, false, false))
    println(win(false, false, true))
    println(win(false, true, false))
    println(win(true, true, true))


}

fun bonusPoints(powerUpActive: Boolean, touchingEagle: Boolean): Boolean {
    return powerUpActive && touchingEagle
}

fun score(touchingPowerUp: Boolean, touchingSeed: Boolean): Boolean {
    return touchingPowerUp || touchingSeed
}

fun lose(powerUpActive: Boolean, touchingEagle: Boolean): Boolean {
    return !powerUpActive && touchingEagle
}

fun win(hasPickedUpAllSeeds: Boolean, powerUpActive: Boolean, touchingEagle: Boolean): Boolean {
    return hasPickedUpAllSeeds && !lose(powerUpActive, touchingEagle)
}