package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_1 {
    public static void main(String[] args) {

        //Create WebDriver instance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open browser
        driver.get("https://www.training-support.net/selenium/iframes");

        //Print title of the page
        System.out.println("Title of the page is: " + driver.getTitle());

        //Switch to first iFrame on the page
        driver.switchTo().frame(0);

        //Perform operation on the first frame
        WebElement frameHeading1 = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of first frame: "+ frameHeading1.getText());

        //Click button in iFrame 1
        WebElement button1 = driver.findElement(By.xpath("//button[@id='actionButton']"));
        System.out.println("Button text: "+button1.getText());
        System.out.println("Button colour: "+button1.getCssValue("background-color"));
        button1.click();


        //Print New Button Info
        System.out.println("New button text: "+button1.getText());
        System.out.println("New Button colour: "+ button1.getCssValue("background-color"));

        //Switch back to parent page
        driver.switchTo().defaultContent();

        //Switch to second iFrame on the page
        driver.switchTo().frame(1);


        //Perform operation on the second frame
        WebElement frameHeading2 = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of frame 2: " + frameHeading2.getText());

        //Click button in iFrame 2
        WebElement button2 = driver.findElement(By.xpath("//button[@id='actionButton']"));
        System.out.println("Text on button in frame 2: "+ button2.getText());
        System.out.println("Color of button in frame 2:"+ button2.getCssValue("background-color"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='actionButton']")));
        button2.click();

        //Print New Button Info
        System.out.println("New Text on button in frame 2: "+button2.getText());
        System.out.println("New color of button in frame 2: "+button2.getCssValue("background-color"));

        //Switch back to parent page
        driver.switchTo().defaultContent();

        //Close browser
        driver.close();
    }
}
