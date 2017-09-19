package pl.droidsonroids.architectureapp.model

const val FIZZ = "fizz"
const val BUZZ = "buzz"

class FizzBuzz {

    fun number(number: Int): String = when (number) {
        3 -> FIZZ
        5 -> BUZZ
        else -> number.toString()
    }

}