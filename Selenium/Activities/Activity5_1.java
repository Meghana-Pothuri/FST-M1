package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

        public static void main(String[] args) {

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            //Open the browser
            driver.get("https://www.training-support.net/selenium/dynamic-controls");

            //Find the page title and print it
            String pageTitle = driver.getTitle();
            System.out.println("Page title is: " + pageTitle);

            //Find the checkbox
            WebElement checkboxInput = driver.findElement(By.xpath("//input[@name='toggled']"));
            System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

            driver.findElement(By.id("toggleCheckbox")).click();

            System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

            //Close the browser
            driver.close();

        }

}
