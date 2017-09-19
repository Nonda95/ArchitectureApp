package pl.droidsonroids.architectureapp.model

import org.junit.Assert.assertEquals
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

    @Test
    fun isReturningOne() {
        val number = fizzBuzz.number()
        assertEquals(1, number)
    }
}

