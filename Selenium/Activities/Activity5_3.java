package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        //Find the input field
        WebElement inputField = driver.findElement(By.xpath("//div[@id='dynamicText']"));
        System.out.println("The input field is enabled: " + inputField.isEnabled());

        //Click enable input button
        WebElement enableFieldButton = driver.findElement(By.xpath("//button[@id='toggleInput']"));
        enableFieldButton.click();

        //Print status
        System.out.println("The input field is enabled: " + inputField.isEnabled());

        //Close the browser
        driver.close();

    }
}
