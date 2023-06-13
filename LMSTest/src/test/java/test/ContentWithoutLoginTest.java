package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContentWithoutLoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Go to the course page
        driver.get("https://frappe.school/courses/frappe-framework-tutorial");
		driver.manage().window().maximize();
		
		//CLick on "Start Learning" button
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/div/div")).click();

        //Login to the site
		driver.findElement(By.id("login_email")).sendKeys("darmenkyzy_04@mail.ru");
		driver.findElement(By.id("login_password")).sendKeys("147741vgyygv");
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div[1]/form/div/div[2]/button")).click();
		
		//Choose a blocked lesson from content list
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[4]/div[2]/div[6]/div[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[4]/div[2]/div[6]/div[2]/div[2]/div/div/div/div")).click();
		
		//Click "Start Learning" button t get access
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/div/div/div[3]/button[2]")).click();
	}

}
