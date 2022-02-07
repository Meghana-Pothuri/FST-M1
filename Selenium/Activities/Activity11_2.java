package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        //Click the button to open a confirmation alert
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Confirmation Alert text is: " + alertText);

        //Close the alert with OK
        confirmAlert.accept();

        //Click the button to open a confirmation alert
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //Switch to alert window
        Alert confirmAlert1 = driver.switchTo().alert();

        //Close the browser with Cancel
        confirmAlert1.dismiss();

        //Close the Browser
        driver.close();
    }
}