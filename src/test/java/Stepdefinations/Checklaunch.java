package Stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checklaunch {

    @Test
    public void test()
    {
        System.setProperty("webdriver.gecko.driver",
                "/home/gaian/Documents/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://192.168.22.57:8080//adwize1.0.1_029/Adwize/#/");


    }
}
