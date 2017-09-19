package pl.droidsonroids.architectureapp.model

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun isReturningOne() {
        val number = fizzBuzz.number(1)
        assertEquals(1.toString(), number)
    }

    @Test
    fun isReturningTwo() {
        val number = fizzBuzz.number(2)
        assertEquals(2.toString(), number)
    }

    @Test
    fun isReturningFuzzFor3() {
        val fuzz = fizzBuzz.number(3)
        assertEquals("fuzz", fuzz)
    }
}

