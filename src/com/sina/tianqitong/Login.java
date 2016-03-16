package com.sina.tianqitong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("×Ô¶¯»¯²âÊÔ");  
		System.setProperty("webdriver.chrome.driver", "C://Program Files//Google//Chrome//Application//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.sina.com.cn");
		WebElement username = driver.findElement(By.id("freename"));
		username.click();
		username.sendKeys("yepingping3840@sina.com");
		WebElement password = driver.findElement(By.id("freepassword"));
		password.click();
		password.sendKeys("qwer1234");
		WebElement login = driver.findElement(By.className("loginBtn"));
		login.click();
		Thread.sleep(3000);
		WebElement weibo = driver.findElement(By.className("wbAllLogo"));
		weibo.click();
		Thread.sleep(3000);
	   driver.close();
	   driver.quit();
	}

}
