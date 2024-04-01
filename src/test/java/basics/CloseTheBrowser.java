package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qacart.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The name of title is " + title);

        driver.quit(); // close all windows and tabs
        //hi
    }
}
