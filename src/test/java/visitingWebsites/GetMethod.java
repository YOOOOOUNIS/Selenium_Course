package visitingWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // We use Get method to open any web page

        driver.get("https://qacart.com");
    }
}
