package pl.droidsonroids.architectureapp.ui.login

import com.nhaarman.mockito_kotlin.*
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import pl.droidsonroids.architectureapp.model.AuthService
import pl.droidsonroids.architectureapp.model.LoginServiceCallback
import pl.droidsonroids.architectureapp.model.Validator

class LoginPresenterTest {

    @Mock
    private lateinit var view: LoginView
    @Mock
    private lateinit var validator: Validator
    @Mock
    private lateinit var service: AuthService
    @InjectMocks
    private lateinit var loginPresenter: LoginPresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun enableLoginButtonWhenCredentialsValid() {
//        given
        whenever(validator.areCredentialsValid(any(), any())).thenReturn(true)

//        when
        loginPresenter.onCredentialsChanged("", "")

//        then
        verify(view).enableLoginButton()
        verify(view, never()).disableLoginButton()
    }

    @Test
    fun disableLoginButtonWhenCredentialsInvalid() {
//        given
        whenever(validator.areCredentialsValid(any(), any())).thenReturn(false)

//        when
        loginPresenter.onCredentialsChanged("", "")

//        then
        verify(view).disableLoginButton()
        verify(view, never()).enableLoginButton()
    }

    @Test
    fun disableLoginButtonWhenLoginClicked() {

        loginPresenter.onLoginClick("", "")

        inOrder(view) {
            verify(view).disableLoginButton()
            verify(view).hideKeyboard()
            verify(view).showProgressBar()
        }
    }

    @Test
    fun goToMainScreenWhenLoginIsSuccess() {
        whenever(service.login(any(), any(), any()))
                .doAnswer { (it.arguments[2] as LoginServiceCallback).onLoginSuccess() }

        loginPresenter.onLoginClick("", "")

        verify(view).goToMainScreen()
    }

    @Test
    fun showLoginErrorWhenLoginIsFailure() {
        whenever(service.login(any(), any(), any()))
                .doAnswer { (it.arguments[2] as LoginServiceCallback).onLoginFailure() }

        loginPresenter.onLoginClick("", "")

        verify(view).showLoginError()
    }

}