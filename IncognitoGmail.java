package gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--incognito");
		  
		  WebDriver driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		 
		  //google website
		  driver.get("https://www.google.co.in");
		
		  //google search Gmail login 
		  WebElement GmailSearch = driver.findElement(By.xpath("//input[@name='q']"));
		  GmailSearch.sendKeys("Gmail login"+Keys.ENTER);
		  
		  //click gmail login
		  WebElement ClickGmail = driver.findElement(By.xpath("//h3[text()='Gmail - Google']"));
		  ClickGmail.click();
		 
		
		//Enter the Username
		WebElement TypeUserName = driver.findElement(By.xpath("//input[@id='identifierId']"));
		TypeUserName.sendKeys("mohamedyousuf0404@gmail.com");
		
		//Click next button
		WebElement NextButton = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		NextButton.click();
		

		}

}
