package stepDefination;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
	

public class TestScript {
	WebDriver driver;
	@Given("^I am on Tokopedia contact us$")
	public void i_am_on_Tokopedia_contact_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tokopedia.com/contact-us#step1");
        Thread.sleep(500);
	}

	@When("^I click akun$")
	public void i_click_akun() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='problem-list-c1']/a/div")).click();
	}

	@Then("^System tokopedia display list of problems encountered$")
	public void system_tokopedia_display_list_of_problems_encountered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.tokopedia.com/contact-us#step4")){
			 System.out.println("Test Pass"); 
		 } else { 
			 System.out.println("Test Failed"); 
		 }
	}

	@When("^I click laporan scam$")
	public void i_click_laporan_scam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.xpath("//*[@id='solution-list-c1']/a[6]")).click();
	    //WebDriverWait wait = new WebDriverWait(driver,300);
	    //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='solution-list-c1']/a[6]/div")));       
	    //driver.findElement(By.xpath("//*[@id='solution-list-c1']/a[6]/div")).click();   
	    Thread.sleep(5000);
	    WebElement zoneName=driver.findElement(By.xpath("//*[@id='solution-list-c1']/a[6]"));
	    zoneName.click();
	}

	@Then("^System tokopedia display laporan scam$")
	public void system_tokopedia_display_laporan_scam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.tokopedia.com/contact-us#step6")){
			 System.out.println("Test Pass"); 
		 } else { 
			 System.out.println("Test Failed"); 
		 }
	}

	@When("^I click Yes, i need another help$")
	public void i_click_Yes_i_need_another_help() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // driver.findElement(By.xpath("//*[@id='step6']/div[3]/a[2]")).click();
	    Thread.sleep(5000);
	    WebElement zoneName=driver.findElement(By.xpath("//*[@id='step6']/div[3]/a[2]"));
	    Capabilities cp = ((RemoteWebDriver) driver).getCapabilities();
        if (cp.getBrowserName().equals("chrome")) {
            try {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView(true);", zoneName);
            } catch (Exception e) {

            }
        }
	    zoneName.click();
	}

	@Then("^System tokopedia display form$")
	public void system_tokopedia_display_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.tokopedia.com/contact-us#step7")){
			 System.out.println("Test Pass"); 
		 } else { 
			 System.out.println("Test Failed"); 
		 }
	}

	@When("^I input data in form$")
	public void i_input_data_in_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='ticket_reply_msg']")).sendKeys("Perkenalkan nama saya Riky salo  merupakan mahasiswa tingkat tiga di institut teknologi del");
		 driver.findElement(By.id("full_name")).sendKeys("Automation Test");
		 driver.findElement(By.id("user_email")).sendKeys("Automation@test.com");
		 Thread.sleep(5000);
		    WebElement zoneName=driver.findElement(By.xpath("//*[@id='pickfiles-nav1']"));
		    Capabilities cp = ((RemoteWebDriver) driver).getCapabilities();
	        if (cp.getBrowserName().equals("chrome")) {
	            try {
	                ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].scrollIntoView(true);", zoneName);
	            } catch (Exception e) {

	            }
	        }
		    zoneName.click();

		    Runtime.getRuntime().exec("E:\\FileUpload.exe");
		// StringSelection ss = new StringSelection("E:\\test.jpg");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 //Runtime.getRuntime().exec("E:\\test.jpg");
		 //driver.findElement(By.id("uploadbutton")).click(); // open the Upload window using selenium    
		 
		 Thread.sleep(20000); // wait for page load    
		 //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\xampp\\htdocs\\cucumbertest1\\new.exe"); // Give  path where the exe is saved.
		 //driver.findElement(By.id("uploadbutton")).click(); // open the Upload window using selenium    
		 driver.findElement(By.xpath("//*[@id='send-message']")).click();
	
	}

	@Then("^System tokopedia display title thank you$")
	public void system_tokopedia_display_title_thank_you() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.tokopedia.com/contact-us#step7")){
			 System.out.println("Test Pass"); 
		 } else { 
			 System.out.println("Test Failed"); 
		 }
	}
}
