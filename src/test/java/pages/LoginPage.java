package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {

    	driver.findElement(By.id("email")).sendKeys(username);
    	driver.findElement(By.id("pass")).sendKeys(password);
    	driver.findElement(By.name("login")).click();

}
}
