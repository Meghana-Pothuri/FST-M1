package Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30,TIMEUNIT.SECONDS);


        //a.Open browser
        //b.Navigate to ‘http://alchemy.hguy.co/crm’
        driver.get("https://alchemy.hguy.co/crm/");

        driver.manage().window().maximize();
    }

    @Test
    public void activity2Method(){

      //c.  Get the url of the header image.
   driver.get("https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g");
        WebElement img = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        String src = img.getAttribute("src");

        //d. Print the url to the console.
        System.out.println("URL of header image is:\n "+ src);
    }

    @AfterClass
    public void afterMethod(){
        //e.close the browser.
        driver.close();
    }

}

