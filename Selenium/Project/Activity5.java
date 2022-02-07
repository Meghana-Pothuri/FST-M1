package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.Color;

public class Activity5 {

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
    @Test
    public void testsetup(){

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
    }


    @Test
    public void activity5Method(){
        //Get the color of the navigation menu and print it to the console.

      WebElement nav_bar = driver.findElementBy.xpath("//div[@class='navbar-header']");
        String s = nav_bar.getCssValue("color");
        String c = Color.fromString(s).asHex();
        System.out.println("Color of navigation menu :" + c);
    }

    @AfterClass
    public void afterMethod(){

        driver.close();
    }


}
