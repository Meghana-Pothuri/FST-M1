package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity8 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        //a. Open browser
        //b.Navigate to ‘http://alchemy.hguy.co/crm’
        driver.manage().timeouts().implicitlyWait(30,TIMEUNIT.SECONDS);
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
    public void activity8Method(){

        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Sales']"));
        //Mouse hover menuOption 'Sales'
        actions.moveToElement(menuOption).perform();

        wait = new WebDriverWait(driver,40);
        // click on Accounts
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"notCurrentTab\"])[1]//following-sibling::a[text()='Accounts']")).click();

        //find no of rows and columns
        List<WebElement> col=driver.findElements(By.xpath("//tbody/tr/td[@field=\"name\"]"));
        int colSize= col.size();
        System.out.println("No of columns:"+colSize);
//Find the table on the page and print the names of the first 5 odd-numbered rows
//of the table to the console.
        for(int colCount=0;colCount<=8; colCount= colCount+2){

            WebElement ele=driver.findElement(By.xpath("(//tbody/tr/td[@field=\"name\"])[colCount]");
            System.out.println("Name column data of odd numbered rows : "+ele.getText());

        }

    }

    @AfterClass
    public void afterMethod(){

        driver.close();
    }

}
