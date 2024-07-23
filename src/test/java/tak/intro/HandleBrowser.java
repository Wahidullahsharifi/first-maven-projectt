package tak.intro;


import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.Scanner;


public class HandleBrowser {

    public static void main(String[] args) throws InterruptedException {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose browser chrome, firefox and edge");
//        String browserType = scanner.next();
//
//        WebDriver driver1;
//        if(browserType.equals("Chrome")){
//
//            driver1=new ChromeDriver();
//
//        }else if(browserType.equals("Edge")){
//            driver1=new EdgeDriver();
//        }else if(browserType.equals("FirFox")){
//            driver1= new FirefoxDriver();
//        }else{
//            throw new RuntimeException("Wrong inpiut");
//        }
//
//
//
//
//        ChromeDriver driver = new ChromeDriver();
//
//
//        driver.get("https://retail.tekschool-students.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        String title=driver.getTitle();
//        System.out.println(title);
//
//        WebElement search=
//
//                driver.findElement(By.id("searchInput"));
//
//        search.sendKeys("Tv");
//        Thread.sleep(3000);
//
//        WebElement serclick= driver.findElement(By.id("searchBtn"));
//        serclick.click();
//
//        Thread.sleep(3000);
//
//        driver.close();


        WebDriver driver =  new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String tit= driver.getTitle();
        System.out.println(tit);

        WebElement creatAcc= driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
        creatAcc.click();
        Thread.sleep(500);


        //Static DropDown:
        //Now we have three opton from drop down.
        //1. By index
        //2. by value
        //2. by visible text.
//we Select  by index:  and index starts from zero.
        WebElement month= driver.findElement(By.cssSelector("select#month"));
        Select monthSelect= new Select(month);
        monthSelect.selectByIndex(3);

        //this is for to get list(names) of all months e.g Jan, Feberuary, March etc.
        String monthes=month.getText();
        System.out.println(monthes);

        // Or We can use List<> as bellow:

//		List<WebElement> opt= monthSelect.getOptions();
//		for(WebElement element: opt) {
//		System.out.println(element.getText());
//			}
//Select by Value: here we give Value
        WebElement day= driver.findElement(By.cssSelector("Select#day"));
        Select daySelect=new Select(day);
        daySelect.selectByValue("12");
//Select by Visible Text" here we give Text
        WebElement year=driver.findElement(By.cssSelector("Select#year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1995");

        Thread.sleep(4000);

        driver.close();







    }

}

/*
 WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By signIn= By.id("signinLink");
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();
        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElm = driver.findElement(createNewAccount);
        createNewAccountElm.click();
        By name = By.id("nameInput");
        WebElement nameElm = driver.findElement(name);
        nameElm.sendKeys("Elena P");
        By email = By.id("emailInput");
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys("elena.pugacheva12345@gmail.com");
        By password = By.id("passwordInput");
        WebElement passwordElm = driver.findElement(password);
        emailElm.sendKeys("123456789Elena#");
        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        confirmPasswordElm.sendKeys("123456789Elena#");
        By signupBtn= By.id("signupBtn");
        WebElement signupBtnElm = driver.findElement(signupBtn);
        signupBtnElm.click();
 */


/*
  WebDriver driver = new ChromeDriver();
        // 01. navigate to the tek website
        driver.get("https://retail.tekschool-students.com/");
        // 02. click to sign in button
        driver.findElement(By.id("signinLink")).click();
        // 03. click to create New Account button
        driver.findElement(By.id("newAccountBtn")).click();
        // 04. enter name
        driver.findElement(By.id("nameInput")).sendKeys("Eric");
        // 05. enter email
        driver.findElement(By.id("emailInput")).sendKeys("eric123@gmail.com");
        // 06. enter password
        driver.findElement(By.id("passwordInput")).sendKeys("Eric@110");
        // 07. confirm password
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Eric@110");
        // 08. click to sign up button
        driver.findElement(By.id("signupBtn")).click();
        // 09. validate profile picture is displayed
        Thread.sleep(3000);
        boolean profilePicture = driver.findElement(By.id("profileImage")).isDisplayed();
        if (profilePicture) System.out.println("Test Passed...");
        else System.out.println("Test Failed...");
        driver.quit();
 */
