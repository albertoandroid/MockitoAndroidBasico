package com.androiddesdecero.mockitotest.login;

/**
 * Created by albertopalomarrobledo on 21/7/17.
 */

public class LoginPresenter implements Login.Presenter {

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view){
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validaUser(String user, String pass) {
        if(view!=null){
            model.validaUser(user, pass);
        }
    }

    @Override
    public void usarioValido() {
        if(view!=null){
            view.usarioValido();
        }
    }

    @Override
    public void error() {
        if(view!=null){
            view.error();
        }
    }
}
