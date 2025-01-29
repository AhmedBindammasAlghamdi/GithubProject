package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static OjectsPath.GithubPaths.*;
import static OjectsPath.LoginPaths.*;

public class LoginPages {
        WebDriver driver = null ;
        public LoginPages(WebDriver driver){
            this.driver = driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signInBtn);
        SignInBtn.click();
    }
    public void clickOnSignUpBtn(){
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }
    public void fillEmail(){
        WebElement Email = driver.findElement(username);
        Email.sendKeys("ahmad.bindammas@gmail.com");
    }

    public void fillPassword(){
        WebElement Email = driver.findElement(password);
        Email.sendKeys("Amdg0898");
    }

    public void ClickOnLogin(){
        WebElement login = driver.findElement(signIn);
        login.click();
    }
}


