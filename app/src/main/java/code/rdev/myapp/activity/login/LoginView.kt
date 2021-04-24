package code.rdev.myapp.activity.login

import code.rdev.myapp.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}