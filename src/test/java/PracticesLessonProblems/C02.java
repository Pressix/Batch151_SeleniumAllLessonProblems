package PracticesLessonProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // arama motorunda nutella yazip aratınız
        WebElement nutella = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        nutella.sendKeys("Nutella", Keys.ENTER);
        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin

       for (int i = 0; i < 2; i++) {
           List<WebElement> butonlar = driver.findElements(By.xpath("(//*[@tabindex='0'])[9] | (//*[@tabindex='0'])[10]"));

           butonlar.get(i).click();
           if (driver.getTitle().contains("Amazon")) {
               System.out.println("PASSED");
           } else System.out.println("FAILED");
           driver.navigate().back();
       }




        // pencereyi kapatiniz
        driver.close();
    }
}