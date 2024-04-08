package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
to check if the element enabled or disabled
 */

public class IsDisplayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.tatmeen.sa/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean email = driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
        System.out.println(email);

    }
}
