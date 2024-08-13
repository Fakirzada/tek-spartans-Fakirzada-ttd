package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import  org.testng.annotations.AfterMethod;
public class Activty1 {

    WebDriver driver=new ChromeDriver();

        @Test
    public void firsttest(){

            driver.get("https://facebook.com");
        }
        @AfterMethod
    public void aftertest(){
        driver.quit();

        }



}
