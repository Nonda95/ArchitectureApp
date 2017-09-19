package pl.droidsonroids.architectureapp.model

const val FUZZ = "fuzz"
const val BUZZ = "buzz"

class FizzBuzz {

    fun number(number: Int): String = when (number) {
        3 -> FUZZ
        5 -> BUZZ
        else -> number.toString()
    }

}