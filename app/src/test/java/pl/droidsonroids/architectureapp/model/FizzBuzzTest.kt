package pl.droidsonroids.architectureapp.model

import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun isFizzBuzzExists() {
        val fizzBuzz = FizzBuzz()
    }

    @Test
    fun isReturnInt() {
        val fizzBuzz = FizzBuzz()
        val number = fizzBuzz.number()
        assertTrue(number is Int)
    }
}

