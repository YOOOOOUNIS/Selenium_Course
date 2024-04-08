package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
check the field is enabled ir disabled
 */

public class IsEnabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.tatmeen.sa/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean email = driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
        System.out.println(email);

    }
}
