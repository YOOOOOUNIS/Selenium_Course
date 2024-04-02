package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.qacart.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String pageSource = driver.getPageSource();
        System.out.println("The current page source is " + pageSource);
//        driver.quit();

    }
}
