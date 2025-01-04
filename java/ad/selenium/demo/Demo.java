package ad.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	// pushing to master
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Actions a = new Actions(driver);
		a.moveByOffset(10,20).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).click();
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		System.out.println("selected pune");
		driver.findElement(By.xpath("//span[text()='Round Trip']")).click();
		
		System.out.println("selected");
		driver.close();
	}
}
