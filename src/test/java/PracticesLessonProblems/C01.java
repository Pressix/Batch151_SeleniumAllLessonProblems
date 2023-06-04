package PracticesLessonProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");;
        Thread.sleep(500);
        // ilk kutucuga 20 giriniz
        driver.findElement(By.xpath("//*[@id='number1']")).sendKeys("20");
        Thread.sleep(500);
        // ikinci kutucuga 30 giriniz
        driver.findElement(By.xpath("//*[@id='number2']")).sendKeys("30");
        Thread.sleep(500);
        // calculate'e tıklayınız
        driver.findElement(By.xpath("//*[@id='calculate']")).click();
        Thread.sleep(500);
        // sonucu yazdırınız
        System.out.println(driver.findElement(By.xpath("//p[text()='Answer : ']")).getText());
        Thread.sleep(500);
        // sayfayi kapatiniz
        driver.quit();

    }
}
