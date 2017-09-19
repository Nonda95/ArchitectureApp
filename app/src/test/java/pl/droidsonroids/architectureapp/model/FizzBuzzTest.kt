package pl.droidsonroids.architectureapp.model

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun isReturningInt() {
        val number = fizzBuzz.number()
        assertTrue(number is Int)
    }
}

