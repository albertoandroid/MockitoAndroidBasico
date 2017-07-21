package com.androiddesdecero.mockitotest.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by albertopalomarrobledo on 21/7/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private Login.Presenter presenter;

    private LoginModel model;

    @Before
    public void setUp() throws Exception{
        model = new LoginModel(presenter);
    }

    @Test
    public void shouldSuccesWithValidUserandPass() throws Exception{
        model.validaUser("alberto","androiddesdecero");
        verify(presenter).usarioValido();
    }

    @Test
    public void shoudNotSucessWithUserandPass() throws Exception{
        model.validaUser("pepe","androiddesdecero");
        verify(presenter).error();
    }

}