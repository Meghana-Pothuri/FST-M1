package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

        public static void main(String[] args) {
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            //Open the browser
            driver.get("https://www.training-support.net/selenium/simple-form");

            //Find the page title and print it
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);

            //Find the input fields and enter text
            WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

            firstName.sendKeys("Jagruti");
            lastName.sendKeys("Badhan");

            //Enter the email
            driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@gmail.com");

            //Enter the contact number
            driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9665582989");

            //Enter Message
            driver.findElement(By.xpath("//div/textarea")).sendKeys("test text");

            //Click Submit
            driver.findElement(By.xpath("//input[@value='submit']")).click();

            driver.quit();
        }

}
