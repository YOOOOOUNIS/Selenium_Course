//package Waits;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class ExplicitWait {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//
//
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/");
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath()))
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//
//
//        driver.findElement(By.xpath("//div[@id='start']/button")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//
//        String name = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText();
//        System.out.println(name);
//
//        driver.close();
//    }
//}
