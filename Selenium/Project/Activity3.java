package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Activity3 {
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
    public void activity3Method(){
      //  c. Get the first copyright text in the footer.

       String copyright_text = driver.findElementBy.id("admin_options").getText();
//d .Print the text to the console.
        System.out.println("First Copyright of the text is: "+copyright_text );

    }

    @AfterClass
    public void afterMethod(){
//e.Close the browser
        driver.close();
    }

}

