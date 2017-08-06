package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by thapa on 8/6/2017.
 */
public class LoginPage {
    WebDriver driver;

    By username =By.id("user_login");
    By password =By.id("user_pass");
    By login= By.id("wp-submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
            }

    public void setUsername(){
        driver.findElement(username).sendKeys("admin");
    }

    public void setPassword(){
        driver.findElement(password).sendKeys("admin");
    }

    public void setLogin(){
        driver.findElement(login).click();;
    }

}
