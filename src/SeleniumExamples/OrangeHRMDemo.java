package SeleniumExamples;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Step 1: Launch OrangeHRM portal
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Step 2: Login to application
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();

        //Step 3: Click on Admin page to add user
        WebElement AdminPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='oxd-main-menu-item']")));
        AdminPage.click();

        WebElement Add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        Add.click();

        //Step 4: Add details

        WebElement userrole = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")));
        userrole.click();
        userrole.sendKeys("Admin");

        WebElement empname = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input")));
        empname.sendKeys("Admin");

        WebElement status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")));
        status.click();
        status.sendKeys("Enabled");











    }
}
