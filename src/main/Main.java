package main;
import java.io.IOException;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main  {
	
	static Scanner scanner ;
	public static void main(String[] args) throws IOException, InterruptedException, NoSuchElementException {
		scanner = new Scanner(System.in);
		System.setProperty("webdriver.edge.driver",".\\resources\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		 driver = new EdgeDriver();
	 
	    
	        driver.get("https://passport.yandex.com/auth/add?from=mail&origin=hostroot_homer_auth_L_com&retpath=https%3A%2F%2Fmail.yandex.com%2F&backpath=https%3A%2F%2Fmail.yandex.com%3Fnoretpath%3D1");
	        
	       String usernamePath = "//*[@id=\"passp-field-login\"]";
	        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernamePath)));
	        WebElement username = driver.findElement(By.xpath(usernamePath));
	     
	        username.sendKeys("xyz@email.com");
	        String login="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]";
	        driver.findElement(By.xpath(login)).click();
	    
	        String passwordPath="//*[@id=\"passp-field-passwd\"]";
	        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordPath)));
	        WebElement password = driver.findElement(By.xpath(passwordPath));
	     
	        password.sendKeys("yourpassword");
	        login="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/button[1]";
	        driver.findElement(By.xpath(login)).click();

	        String composePath="//*[@id=\"nb-1\"]/body/div[2]/div[5]/div/div[3]/div[2]/div[2]/div/div/a/span";
	        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(composePath)));
	        WebElement compose = driver.findElement(By.xpath(composePath));
	        compose.click();
	      
	    
	        String toPath="//*[@id=\"nb-1\"]/body/div[9]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div/div/div/div";
	        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toPath)));
	        WebElement to = driver.findElement(By.xpath(toPath));
	        to.sendKeys("xyz@gmail.com");
	        Thread.sleep(7000);
	      
	       String subjectPath="//*[@id=\"nb-1\"]/body/div[9]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[3]/form/div/div/input";
	       WebElement subject = driver.findElement(By.xpath(subjectPath));
	       subject.sendKeys("First mail");
	       Thread.sleep(7000);
	       String messagePath="//*[@id=\"cke_1_contents\"]/div";
	        WebElement message = driver.findElement(By.xpath(messagePath));
	        message.sendKeys("Boredddddd!!!");
	      
	        String sendPath="//*[@id=\"nb-1\"]/body/div[9]/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/button";
	       
	        Thread.sleep(7000);
	        driver.findElement(By.xpath(sendPath)).click();
	        
	}
	
	
}
