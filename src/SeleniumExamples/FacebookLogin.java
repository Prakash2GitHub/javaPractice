package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) {


        //Signup on facebook

        WebDriver driver = new ChromeDriver();
        //Step 1: Launch url
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        //Add Details
        driver.findElement(By.name("firstname")).sendKeys("Prakash");
        driver.findElement(By.name("lastname")).sendKeys("Kamble");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("9860289604");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Aaryan9@1025");
        driver.findElement(By.name("websubmit")).click();

        driver.findElement(By.xpath("//*[@id='u_4_2_uF']")).click();

        //Step 2: Enter Username and password
        driver.findElement(By.name("email")).sendKeys("TestPrakash");
        driver.findElement(By.name("pass")).sendKeys("Password");
        driver.findElement(By.name("login")).click();
        System.out.println("User clicked on Login button");



    }
}
