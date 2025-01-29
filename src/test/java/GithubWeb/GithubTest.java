package GithubWeb;


import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

import java.time.Duration;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);


        login.openGitUrl();
        login.clickOnSignInBtn();
    }
    @Test
    public void SignUpMethod() throws InterruptedException{
        LoginPages SignUp = new LoginPages(driver);

        SignUp.openGitUrl();
        SignUp.clickOnSignUpBtn();
    }

}
