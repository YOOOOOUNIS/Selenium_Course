package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLselenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        System.out.println("The current url is " + url);


    }
}
