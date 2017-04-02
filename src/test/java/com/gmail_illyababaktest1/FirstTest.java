package com.gmail_illyababaktest1;

import org.junit.*;
import org.openqa.selenium .By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class FirstTest {

        private static WebDriver driver;

    @BeforeClass
    public static void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.google.com.ua/");
    }
    @Test
    public void serchingSite () {
        driver.get("https://www.google.com.ua/");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("foxminded", Keys.ENTER);
        driver.findElement(By.linkText("Foxminded")).click();
        assertTrue(driver.getCurrentUrl().contentEquals("http://foxminded.com.ua/"));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

        @AfterClass
    public static void browserQuit(){
       // driver.quit();

    }
}
