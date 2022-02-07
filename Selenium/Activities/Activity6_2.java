package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://training-support.net/selenium/ajax");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        //Find and click the button
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();

        //Wait for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        //getText() and print it
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Initial text: "+ ajaxText);

        //Wait for latest text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        //Get latest text and print it
        String latestText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Latest text is: " + latestText);

        //Close browser
        driver.close();
    }
}
