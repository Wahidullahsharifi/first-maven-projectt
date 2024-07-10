package tak.intro;

import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrowser {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String title=driver.getTitle();
        System.out.println(title);


        driver.close();



    }

}
