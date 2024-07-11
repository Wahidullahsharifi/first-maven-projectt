package tak.intro;


import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HandleBrowser {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println(title);


        WebElement search= driver.findElement(By.id("searchInput"));

        search.sendKeys("Tv");
        Thread.sleep(3000);

        WebElement serclick= driver.findElement(By.id("searchBtn"));
        serclick.click();

        Thread.sleep(3000);

        driver.close();


    }

}
