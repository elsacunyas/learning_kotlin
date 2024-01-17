//https://exercism.org/tracks/swift/exercises/custom-signs
fun main() {
   println(buildSigns(valentine,"Kevin"))
    println(graduationFor("Kevin",2023))
    println(costOf(buildSigns(birthday,"Grandma")))
}

//Create a set useful string
val birthday ="Birthday"
val valentine ="Valentine's Day"
val anniversary ="Anniversary"

//Create a set of useful Characters
val space = ' '
val exclamation = '!'

//combine phrases to build up messages
fun buildSigns(forA: String , name: String) :String{
    return "Happy$space$forA$space$name$exclamation"
}

//
fun graduationFor(name: String ,year: Int):String{
    return "Congratulations$space$name$exclamation\nClass$space of$space$year"
}

///
fun costOf(sign: String):Int{
    return  sign.length*2+20
}