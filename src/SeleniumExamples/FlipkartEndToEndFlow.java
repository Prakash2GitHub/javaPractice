package SeleniumExamples;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Mobiles & Tablets")).click();

        driver.findElement(By.xpath("//*[@class='ewzVkT _3DvUAf']")).click();

        driver.findElement(By.className("G4BRas")).click();

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();





    }
}
