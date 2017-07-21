package com.androiddesdecero.mockitotest.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by albertopalomarrobledo on 21/7/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private Login.View view;
    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUt() throws Exception{
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUserorPasswordisWrong() throws Exception{
        when(view.getUserName()).thenReturn("jaime");
        when(view.getPassword()).thenReturn("androiddesdecero");
        presenter.validaUser(view.getUserName(),view.getPassword());
        verify(view).error();
    }

    @Test
    public void shouldPassWhenUserandPasswordareRight() throws Exception{
        when(view.getUserName()).thenReturn("jaime");
        when(view.getPassword()).thenReturn("androiddesdecero");
        presenter.validaUser(view.getUserName(),view.getPassword());
        verify(view).usarioValido();
    }

}