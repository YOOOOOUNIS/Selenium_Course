package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));


        driver.close();
    }
}
