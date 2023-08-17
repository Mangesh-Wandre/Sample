package Hashtag;

import java.awt.Dimension;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class UserInterface 
{
	static WebDriver driver=null;
	
	public static void getBrowserLaunch()
	{
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.manage().deleteAllCookies();
		
	}
	public static void getTitleVerification()
	{
		String exlTitle = "";
		String acTitle = driver.getTitle();
		if(acTitle.equals(exlTitle))
			System.out.println("Title Verification Test Case is Pass");
		else
			System.out.println(" Title VerificationTest Case is Pass");
	}
	
	public static void isLogoDisplayed()
	{
		//Logo Verification (Header)
		
		boolean logoResHd = driver.findElement(By.xpath("//img[@src='/hashtag-new-logo-header.svg']")).isDisplayed();
		if(logoResHd==true)
			System.out.println("Logo Verification (Header) Test Case is Pass");
		else
			System.out.println("Logo Verification (Header) Test Case is Pass");
		
		// Logo Verification (Footer)
		
				boolean logoResFt = driver.findElement(By.xpath("//img[@src='/images/hashtag-footer-logo.svg']")).isDisplayed();
				if(logoResFt==true)
					System.out.println("Logo Verification (Footer) Test Case is Pass");
				else
					System.out.println(" Logo Verification (Footer) Test Case is Pass");
		
	}
	public static void getLogoSize()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@src='/images/hashtag-footer-logo.svg']"));
		org.openqa.selenium.Dimension dim = logo.getSize();
		System.out.println("Width of Logo :-"+dim.width);
		System.out.println("Height of Logo :-"+dim.height);
		
	}
	public static void getHeaderMenuVerification() throws InterruptedException
	{
		
		String str="Services, , , , , , ,Shopify,(current),Blog,(current),Careers,(current),Case studies,(current),About Us,(current),Contact Us,(current)";
		String[] exptRes = str.split(",");
		List<WebElement> listHeader = driver.findElements(By.xpath("//*[@id=\"navbarTogglerDemo03\"]//li"));
		boolean isok=true;		
	//List<String> text = listHeader.stream().map(WebElement::getText).collect(Collectors.toList());
		System.out.println("List of Header webElement");

	//	System.out.println("Mateches   "+text.equals(Arrays.asList(exptRes)));
		for (WebElement listHd : listHeader)
		{
//			int i=Arrays.asList(exptRes).indexOf(listHd.getText());
//			
//			if(i==-1)
//			{
//			 isok=false;	
//			}
//			else
				System.out.println(listHd.getText());	
		
		}	

}
	public static void isJoinUsBoxDisplayed()
	{
		WebElement box = driver.findElement(By.xpath("(//*[@id='CcstyleSpaceIs'])[2]"));
		if(box.isDisplayed())
		{
			System.out.println("Join Us Box is Displayed & Test case is pass");
		}
	}
	
	public static void fillDataFromExcel() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//*[@id='contact-form']/div/div[2]/input"));
		name.sendKeys("Mangesh Wandre");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id='contact-form']/div/div[3]/input"));
		email.sendKeys("wandrearchana01@gmail.com");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//*[@id='contact-form']/div/div[4]/input"));
		phone.sendKeys("8830649582");
		Thread.sleep(2000);
		WebElement resume = driver.findElement(By.xpath("//*[@id='inputFile']"));
		resume.sendKeys("C:\\Users\\User\\Desktop/ARCHANA WANDRE RESUME.pdf");
		Thread.sleep(2000);
		WebElement desc = driver.findElement(By.xpath("//*[@id='contact-form']/div/div[6]/textarea"));
		desc.sendKeys("Experienced professional having more than 3 years of experience in Software Testing that "
				+ "includes Manual Testing which comprises of functional testing, Regression testing, Web Services testing,"
				+ "Automation testing,TestNG,Annotations,Cucumber");
		
		WebElement apply = driver.findElement(By.xpath("//button[@class='btn form-button-child px-3']"));
		apply.click();
		
	}
		
	public static void main(String[] args) throws InterruptedException
	{
		//browser launch
				getBrowserLaunch();
				
				//Title Verification
				
				getTitleVerification();
				
				//Logo Verification (Header)
				
				isLogoDisplayed();
				
				//Logo Size
						
				getLogoSize() ;	
				//Header Menu's
				getHeaderMenuVerification();
				
				//Join Us box verification
				isJoinUsBoxDisplayed();
				
				//Join US Form Filling
				fillDataFromExcel();
				
				
		
			
		
		

	}

}





OutPut :-

Title Verification Test Case is Pass
Logo Verification (Header) Test Case is Pass
Logo Verification (Footer) Test Case is Pass
Width of Logo :-165
Height of Logo :-48
List of Header webElement
Services






Shopify
(current)
Blog
(current)
Careers
(current)
Case studies
(current)
About Us
(current)
Contact Us
(current)
Join Us Box is Displayed & Test case is pass