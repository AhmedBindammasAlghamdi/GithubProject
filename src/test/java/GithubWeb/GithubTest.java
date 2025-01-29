package GithubWeb;


import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

import java.time.Duration;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);


        login.openGitUrl();
        login.ClickOnLogin();
        login.fillEmail();
        login.fillPassword();
        login.clickOnSignInBtn();
    }
    @Test
    public void SignUpMethod() throws InterruptedException{
        LoginPages SignUp = new LoginPages(driver);

        SignUp.openGitUrl();

    }
    @Test
    public void createRepoMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);

        loginPageMethod();
        home.clickOnNewRepo();
        home.fillRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,600);
        home.clickOnCreateRepo();
        Thread.sleep(5000);
    }



}
