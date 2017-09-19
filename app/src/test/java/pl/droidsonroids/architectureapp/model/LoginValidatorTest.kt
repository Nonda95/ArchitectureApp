package pl.droidsonroids.architectureapp.model

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Created by osmal on 19.09.2017.
 */
class LoginValidatorTest {

    private lateinit var loginValidator: Validator

    @Before
    fun setUp() {
        loginValidator = LoginValidator()
    }

    @Test
    fun isLoginAndPasswordValid() {
        assertTrue(areCredentialValid())
    }

    @Test
    fun isPasswordTooShort() {
        assertFalse(areCredentialValid(password = "Pas"))
    }

    @Test
    fun isPasswordWithoutUpperCaseLetter() {
        assertFalse(areCredentialValid(password = "passw0rd"))
    }

    @Test
    fun isPasswordWithoutDigit() {
        assertFalse(areCredentialValid(password = "passworD"))
    }

    @Test
    fun isPasswordWithWhiteSpacePrefix() {
        assertTrue(areCredentialValid(password = " passw0rD"))
    }

    @Test
    fun isPasswordWithWhiteSpaceSuffix() {
        assertTrue(areCredentialValid(password = "passw0rD "))
    }

    @Test
    fun isLoginTooShort() {
        assertFalse(areCredentialValid(login = "lo"))
    }

    @Test
    fun isLoginWithWhiteSpaceInside() {
        assertFalse(areCredentialValid(login = "log in"))
    }

    @Test
    fun isLoginWithWhiteSpacePrefix() {
        assertTrue(areCredentialValid(login = " login"))
    }

    @Test
    fun isLoginWithWhiteSpaceSuffix() {
        assertTrue(areCredentialValid(login = " login"))
    }

    private fun areCredentialValid(login: String = "Login", password: String = "Password123")
            = loginValidator.areCredentialsValid(login, password)
}