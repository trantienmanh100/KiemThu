package ASS2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASSJava4Test {
	  WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  this.driver.get("http://localhost:8080/QLBH/users/index");	
		  }
    @Test
    public void testTitle() {
    	String title = driver.getTitle();
    	assertEquals(title, "Shop Quần áo");
    } 
    @Test(groups = "sp")
    public void testProduct() {
    	String name = driver.findElement(By.cssSelector("body > section > div > div > div:nth-child(2) > div > div.card-body.p-4 > div > h5")).getText();
    	this.driver.findElement(By.cssSelector("body > section > div > div > div:nth-child(2) > div > div.card-footer.p-4.pt-0.border-top-0.bg-transparent > div > a")).click();
    	String nameCT = this.driver.findElement(By.cssSelector("body > div > div:nth-child(1) > div.col-7 > h2")).getText();
    	assertEquals(name,nameCT);
    };
    @Test(groups = "sp")
    public void testPriceProduct() {
    	String name = driver.findElement(By.cssSelector("body > section > div > div > div:nth-child(2) > div > div.card-body.p-4 > div > p")).getText();

    	assertEquals(name,"500.000VNĐ");
    }
    
	  

	  @AfterTest
	  public void afterTest() {
		  this.driver.close();
	  }
}
