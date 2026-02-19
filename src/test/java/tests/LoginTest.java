package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("test@gmail.com", "wrongpassword");
        
        Assert.assertTrue(driver.getTitle().contains("Facebook"));


  
    }
}
