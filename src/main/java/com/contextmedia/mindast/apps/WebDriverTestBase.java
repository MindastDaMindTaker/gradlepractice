package com.contextmedia.mindast.apps;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by santino.scarborough on 2/22/17.
 */
public class WebDriverTestBase {
    protected static WebDriverWait wait;
    protected static WebDriver webDriver;

    @AfterClass
    public static void afterClass() {
        webDriver.quit();
    }

    public WebDriverTestBase() {
        if (webDriver == null) {
            // Chromedriver 2.25 - Updated 10.25.2016
            System.setProperty("webdriver.chrome.driver", "src/main/WEB-INF/lib/chromedriver");
            webDriver = new ChromeDriver();
            wait = new WebDriverWait(webDriver, 30);
        }
    }
}
