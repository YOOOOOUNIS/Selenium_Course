package TestOnTatmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tatmeen.sa");
        driver.manage().window().maximize();
        String elementText = driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div/div[3]/div/div[1]/div[2]/ul/li[1]/a")).getText();
        System.out.println(elementText);
        driver.quit();
    }
}
