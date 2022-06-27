package base.cucumber.junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	protected WebDriver driver;
	protected Select select;

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public String baseDemo =  "https://www.blazedemo.com/";
    public String baseMulta = "https://e-menu.sunat.gob.pe/cl-ti-itmenu2/MenuInternetPlataforma.htm";
    public String base = "https://phptravels.org/index.php?rp=/login";
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("start-maximized");
		options.addArguments(" --ignore-certificate-errors");
		//options.setBinary("C:\\no_cors\\acceso");
		driver = new ChromeDriver(options);
		return driver;
	}
	
	public Select selecfindElement() {
		return select;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);		
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
		
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
     public void type(String inputText, By locator) {
    	 driver.findElement(locator).sendKeys(inputText);
     }
     
     public void click(By locator) {
    	 driver.findElement(locator).click();
     }
     
     public Boolean isDisplayed(By locator) {
    	 try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
     }
     
     public void visit(String url) {
    	 driver.get(url);
     }
     
}