package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;



import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class BrowserClass {
    public static WebDriver driver;

    public void browser() {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void addCus(String fname, String lname, String postcode) {

///html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/input
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(postcode);

    }

    public void clickButt() {

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    }

    public void alertt() {

        WebDriverWait wait=new WebDriverWait(driver, 20);

       String al = driver.switchTo().alert().getText().toString();
        System.out.println("This is Alert Message >>>>> " + al);

        String msg = "Customer added successfully with customer id :6";

       // assertEquals(al,msg);

        try {
            Assert.assertEquals(al, msg);
        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

        Alert alert = driver.switchTo().alert();
        alert.accept();
        }
        //////////////////////// 2nd Scenario //////////////////////

    public void openAcc() {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();
    }

    public void nameCus() {

        String option="rashed barat";

        driver.findElement(By.xpath("//select")).click();

        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        dropdown.click();
    }

    public void currencyCus() {

        // driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();


        String option="Dollar";
     
        driver.findElement(By.xpath("//select")).click();

        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        dropdown.click();

/*
        Select drpCountry = new Select(driver.findElement(By.name("currency")));
        drpCountry.selectByValue("Dollar");*/

    }

    public void clickButtDola() {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    //////////////////////// 3rd Scenario //////////////////////

    public void goCus() {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();

    }

    public void searchCus() {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("rashed");
        // Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys(Keys.ENTER);

    }

    public void deleteCus() {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button")).click();

    }

   public void homeCus() {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
       driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("rashed");
       // Thread.sleep(3000);

       driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys(Keys.ENTER);

    }

}
