package ASS2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASSJava4TestDuongBien {
	  WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  this.driver.get("http://localhost:8080/QLBH/users/index");	
		  this.driver.findElement(By.cssSelector("#navbarSupportedContent > form > ul > li > a")).click();
		  this.driver.findElement(By.cssSelector("body > section > div > div:nth-child(2) > div > div > form > div:nth-child(1) > input")).sendKeys("a@gmail.com");
		  this.driver.findElement(By.cssSelector("#password-field")).sendKeys("12345");
		  this.driver.findElement(By.cssSelector("body > section > div > div:nth-child(2) > div > div > form > div:nth-child(3) > button")).click();
		  }
	  
    @Test(dataProvider = "dp")
    public void testSL(String sl,String gia) {
    	this.driver.findElement(By.cssSelector("section.py-5:nth-child(4) div.container.px-4.px-lg-5 div.row.gx-4.gx-lg-5.row-cols-2.row-cols-md-3.row-cols-xl-4.justify-content-center div.col.mb-5:nth-child(2) div.card.h-100 div.card-footer.p-4.pt-0.border-top-0.bg-transparent div.text-center > a.btn.btn-outline-dark.mt-auto")).click();
    	this.driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div.col-7 > form > p > input.fw-bold")).clear();
    	this.driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div.col-7 > form > p > input.fw-bold")).sendKeys(sl);
    	this.driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div.col-7 > form > button")).click();
    	String mss="";
    	if(sl.equals("44") || sl.equals("-1") || sl.equals("0")) {
    		System.out.println("In" + sl);
    		mss="No";
    		this.driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(1) > a")).click();
    		
    	   System.out.println(this.driver.getCurrentUrl());
    	}else  {
    		mss = this.driver.findElement(By.cssSelector("body > section > div > div.row.w-100 > div.row > div.float-right.text-right.col-2 > h4:nth-child(2)")).getText();
    		this.driver.findElement(By.cssSelector("#shoppingCart > tbody > tr > td.actions > div > a")).click();
    		this.driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(1) > a")).click();
			
    		System.out.println(this.driver.getCurrentUrl());
    		
    	}
    	assertEquals(gia, mss);
    	
    } 
    
    
	  
   @DataProvider(name = "dp")
	public Object [][] tieuDe() {
		  return new Object[][] {
			  {"44", "No"},
			  {"43","21,500,000"},
			  {"1", "500,000"},
			  {"42","21,000,000"},
			  {"-1", "No"},
			  {"0", "No"}
		  };
		  }
   @AfterTest
	  public void afterTest() {
		  this.driver.close();
	  }
}
