package MultipleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diffrenceBetweenCloseAndQuit {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

//        to close one tab use
        driver.quit();

//        to close the browser
        driver.close();
    }
}
