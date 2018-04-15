package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass
{
	public static void main(String[] args) throws InterruptedException
	{
		String baseUrl = "https://www.axa-direct.co.jp/";
		
		//Using the Gecko Driver
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		//Defining driver
		WebDriver driver = new FirefoxDriver();
		
		//Launching the dropdown Page
		driver.get(baseUrl);
			
		//Maximize the newly loaded window
		driver.manage().window().maximize();
		
		WebElement proposalCreationLink = driver.findElement(By.xpath("//a[@class='auto-cv-btn btn-quote']"));
		proposalCreationLink.click();
		
		WebElement login = driver.findElement(By.id("Login2"));
		login.click();
		
		WebElement firstPurchaseCase = driver.findElement(By.cssSelector("img#imgFirstPurchaseCase"));
		firstPurchaseCase.click();
		
		WebElement imgOtherPolicyNo = driver.findElement(By.id("imgOtherPolicyNo"));
		imgOtherPolicyNo.click();
		
		WebElement lastNameKanji = driver.findElement(By.id("LastNameKanji"));
		lastNameKanji.sendKeys("Fujimura");
		
		WebElement firstNameKanji = driver.findElement(By.id("FirstNameKanji"));
		firstNameKanji.sendKeys("Francesca");
		
		WebElement lastNameKana = driver.findElement(By.id("LastNameKana"));
		lastNameKana.sendKeys("Fujimura");
		
		WebElement firstNameKana = driver.findElement(By.id("FirstNameKana"));
		firstNameKana.sendKeys("Francesca");
		
		
		
		//List Element to capture all the elements from the dropdown list
		//List<WebElement> allOptions = drpdwn.getOptions();
		//Iterator<WebElement> it = allOptions.iterator();
		//System.out.println(allOptions.size());
		
		/*while(it.hasNext())
		{
			WebElement el = (WebElement) it.next();
			//System.out.println("TEST1");
			//Check for the required element by Text and click it
			if(el.getText().equals("Samsung Note 3"))
			{
				//System.out.println(el.getAttribute(“value”));
				//el.click();
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
		}
		drpdwn.selectByIndex(3);
		Thread.sleep(5000);
		
		//close Firefox
		driver.close();
		driver.quit();*/
	}
}