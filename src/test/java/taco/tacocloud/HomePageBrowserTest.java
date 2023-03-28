package taco.tacocloud;


import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;






@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomePageBrowserTest {
    
    @LocalServerPort
    private int port;
    public static HtmlUnitDriver browser;

    @BeforeTestClass
    public static void setup() {
        browser = new HtmlUnitDriver();

        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterTestClass
    public static void teardown() {
        browser.quit();
    }
    
    @Test
    public void testHomePage() {
        String homePage = "https://localhost:" + port;
        browser.get(homePage);

        String titleText = browser.getTitle();
        Assertions.assertEquals("Taco Cloud", titleText);

        String h1Text = browser.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Welcome to...", h1Text);

        String imgSrc = browser.findElement(By.tagName("img")).getAttribute("src");
        Assertions.assertEquals(homePage + "/images/TacoCloud.png", imgSrc);

    }



}
