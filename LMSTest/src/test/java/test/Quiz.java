package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quiz {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Go to the login page
		driver.navigate().to("https://frappe.school/courses/frappe-framework-tutorial");
		driver.manage().window().maximize();
		
		//Start learning
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/div/div")).click();
		
		//Login
		driver.findElement(By.id("login_email")).sendKeys("darmenkyzy_04@mail.ru");
		driver.findElement(By.id("login_password")).sendKeys("147741vgyygv");
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div[1]/form/div/div[2]/button")).click();

		//Redirect to course page 
		//driver.navigate().back();
		
		//quiz time
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/div[2]/div[7]/div[1]")).click();

		//quiz
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/div[2]/div[7]/div[2]/div[2]/div/a")).click();
		
		//Start the quiz
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[3]/div/div/div/button")).click();
		
		//Variant A
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[3]/div/div/form/div[1]/div[1]/div[2]/div/label/div[2]")).click();
		
		//Check
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[3]/div/div/form/div[2]/button")).click();
	
		//Next question
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[3]/div/div/form/div[2]/div[1]")).click();
	}

}
