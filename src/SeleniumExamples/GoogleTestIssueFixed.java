package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestIssueFixed {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("APjFqb")).sendKeys("Automation Test Hub", Keys.ENTER);

        driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']")).click();

    }
}
