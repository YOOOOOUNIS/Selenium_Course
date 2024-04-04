package InteractWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tatmeen.sa/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abdalrahman@baianat.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@1234");
    }
}
