package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Find the "Get Started!" link and click it
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        //Print title of new page
        System.out.println("Title of new page: " + driver.getTitle());

        //Close the browser
        driver.close();

    }


}
