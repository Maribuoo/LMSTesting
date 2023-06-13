package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://frappe.school/login");
		driver.manage().window().maximize();

		//driver.findElement(By.id("login_email")).sendKeys("darmenkyzy_04@mail.ru");
		driver.findElement(By.id("login_email")).sendKeys("heh@heh.com");
		driver.findElement(By.id("login_password")).sendKeys("147741vgyygv");
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div[1]/form/div/div[2]/button")).click();
		//driver.close();

		
		
	}

}
