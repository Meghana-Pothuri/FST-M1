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

public class Activity6 {
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
    public void activity6Method(){

        // c. Locate the navigation menu.
        //d. Ensure that the “Activities” menu item exists.

        boolean activities= driver.findElement(By.xpath("//a[text()='Activities']")).isDisplayed();

          if(activities==true){

              System.out.println("Activites menu item exists") ;
          }
    }

    @AfterClass
    public void afterMethod(){
        //close the browser
       driver.close();
    }

}

