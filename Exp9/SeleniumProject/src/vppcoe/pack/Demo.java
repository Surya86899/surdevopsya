package vppcoe.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surya\\Downloads\\Exe files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("dora42240@gmail.com");
		driver.findElement(By.className("VfPpkd-Jh9lGc")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failure");
		}
		
	}

}
