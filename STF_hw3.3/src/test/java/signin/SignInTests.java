package signin;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SignIn;

import static org.testng.Assert.assertTrue;

public class SignInTests extends BaseTests {

    @Test
    public void wrongSingIn(){
        SignIn signinPage = homePage.clickLogin();
        signinPage.setEmailAddress("nane@gmail.com");
        signinPage.SetPassword("hola");
        signinPage.submit();
        assertTrue(signinPage.errorExists());
    }

}
