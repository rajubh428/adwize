package Stepdefinations;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdwizeMethods {
    public WebDriver driver;
    public Scenario s;
    @Before
    public void method1(Scenario s)
    {
        this.s=s;
    }
    public void screenShot(){
        byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        s.embed(ss,"image/png");
    }
    @Given("^launch Adwize site$")
    public void siteLaunch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\batch365\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("http://54.251.154.8:8080/adwizeui1.0.1_045/Adwize/#/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("title of the page is "+driver.getTitle());
    }
    @Then("^title is \"(.*)\" homepage$")
    public void titleValidation(String d)
    {
        String title=driver.getTitle();
        System.out.println("title of the page is "+title);
        if (d.equalsIgnoreCase(title))
        {
            s.write("test is passed");
            this.screenShot();
        }
        else {
            s.write("test is failed");
            org.testng.Assert.fail("test is failed");
            this.screenShot();
        }
    }
    @And("^click on advertiser radio button$")
    public void method7() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Advertiser']")).click();
        Thread.sleep(3000);
    }
    @When("^enter userid as \"(.*)\"$")
    public void userid(String uid) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='loginUsername']")).sendKeys(uid);
        Thread.sleep(300);
    }
    @When("^enter password \"(.*)\"")
    public void password(String pwd) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='loginPassword']")).sendKeys(pwd);
        Thread.sleep(300);
    }
    @And("^click on signin button$")
    public void signInButton() throws InterruptedException {
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
    }

    @And("^click on publisher radio button$")
    public void method8() throws InterruptedException {
        driver.findElement(By.xpath("(//*[text()='Publisher '])[1]")).click();
        Thread.sleep(3000);
    }
    @And("^click on admin radio button$")
    public void method9()
    {
        driver.findElement(By.xpath("//*[text()='Admin ']")).click();
    }

    @And("^close site$")
    public void method4() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
    }
}
