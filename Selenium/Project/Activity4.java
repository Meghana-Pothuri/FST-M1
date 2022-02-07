package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Activity4 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30,TIMEUNIT.SECONDS);

        //a. Open browser
        //b.Navigate to ‘http://alchemy.hguy.co/crm’
        driver.get("https://alchemy.hguy.co/crm/");
        driver.manage().window().maximize();

    }

    @Test(priority = 0)
    public void testSetup(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
    }

    @Test
    public void activity4Method(){

    boolean homePage = driver.findELement(By.id("moduleTab_Home")).isDisplayed();

        if(homePage==True){

    //Verify that the homepage has opened.
    System.out.println("Homepage has opened");
}
    }

    @AfterClass
    public void afterMethod(){
// close browser
        driver.close();
    }

}

