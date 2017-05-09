package testSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class AutoScript2 {
	public static void main(String[] args){
	WebDriver driver1=new FirefoxDriver();
	driver1.get("http://www.guru99.com/");
	WebElement wb=driver1.findElement(By.xpath("//a[text()='Learn Selenium']"));
	wb.click();
	}

}
