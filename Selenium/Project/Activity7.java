package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");


    }


    @Test(priority = 0)
    public void testSetup(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
    }


    @Test
    public void activity7Method(){

        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Sales']"));
        //Mouse hover menuOption 'Sales'
        actions.moveToElement(menuOption).perform();

        wait = new WebDriverWait(driver,50);
        // click on Leads
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"notCurrentTab\"])[1]//following-sibling::a[text()='Leads']")).click();

        wait = new WebDriverWait(driver,50);
        // click on Additional details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Additional Details'])[1]")).click();

        wait = new WebDriverWait(driver,50);
        // click on phone number
   String phn_num=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,\"open ui-dialog-content\")]//following-sibling::span[@class='phone'])[6]")).getText();

System.out.prinln("Phone number is" +phn_num);

    }

    @AfterClass
    public void afterMethod(){
        driver.close();
    }

}
