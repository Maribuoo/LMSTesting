package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPasswordTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://frappe.school/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div[1]/form/div/div[1]/p/a")).click();
		driver.findElement(By.id("forgot_email")).sendKeys("invalid@error.com");
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[4]/div/form/div[3]/button")).click();
	}

}
