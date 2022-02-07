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
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Activity9 {
    WebDriver driver;
    WebDriverWait wait;
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
    public void testSetup(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
    }

    @Test
    public void activity9Method(){


        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Sales']"));
        //Mouse hover menuOption 'Sales'
        actions.moveToElement(menuOption).perform();

         wait = new WebDriverWait(driver,50);
         // click on Leads
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"notCurrentTab\"])[1]//following-sibling::a[text()='Leads']")).click();

        //find no of rows and columns
        List<WebElement> col=driver.findElements(By.xpath("//tbody/tr/td[@field=\"name\"]"));
        int colSize= col.size();
        System.out.println("No of columns:"+colSize);

        List<WebElement> col_users=driver.findElements(By.xpath("(//tbody/tr/td[@field=\"assigned_user_name\"])"));
        int col_users1= col_users.size();
        System.out.println("No of rows:"+col_users);

        for(int colCount=0;colCount<=10;colCount++){

                WebElement ele=driver.findElement(By.xpath("(//tbody/tr/td[@field=\"name\"])[colCount]");
                System.out.println("Name column data : "+ele.getText());

        }
        for(int colCount1=0;colCount1<=10;colCount1++){

            WebElement ele=driver.findElement(By.xpath("(//tbody/tr/td[@field=\"assigned_user_name\"])[colCount1]");
            System.out.println("User column data : "+ele.getText());
        }
    }

    @AfterClass
    public void afterMethod(){
        driver.close();
    }

}
