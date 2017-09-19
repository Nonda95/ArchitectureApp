package pl.droidsonroids.architectureapp.model

const val FUZZ = "fuzz"

class FizzBuzz {
    fun number(number: Int): String = when (number) {
        3 -> FUZZ
        else -> number.toString()
    }

}