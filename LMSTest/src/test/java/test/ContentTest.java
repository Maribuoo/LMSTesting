package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContentTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Go to the course page
        driver.get("https://frappe.school/courses/sales-management-course");
		driver.manage().window().maximize();
        
        //Click to the "Login" page redirect button
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/div/div")).click();
        
		//Login to the account to get access to the course page
		driver.findElement(By.id("login_email")).sendKeys("darmenkyzy_04@mail.ru");
		driver.findElement(By.id("login_password")).sendKeys("147741vgyygv");
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div[1]/form/div/div[2]/button")).click();
		
		
		//Click a play button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[4]/a")).click();


		
		
		//driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[3]/div[1]/div/div[3]/div[1]/div")).click();
		//driver.findElement(By.className("ytp-large-play-button ytp-button ytp-large-play-button-red-bg")).click();
		//
	}

}
