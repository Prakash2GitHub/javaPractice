package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginIssueFixed {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Prakash");
    }
}
