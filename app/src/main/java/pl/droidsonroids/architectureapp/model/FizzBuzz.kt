package pl.droidsonroids.architectureapp.model

class FizzBuzz {
    fun number(number: Int): Any = when (number) {
        3 -> "fuzz"
        else -> number
    }

}