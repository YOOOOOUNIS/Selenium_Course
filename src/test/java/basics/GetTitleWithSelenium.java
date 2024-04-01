package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleWithSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qacart.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The name of title is " + title);

    }
}
