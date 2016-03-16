package com.sina.tianqitong;

import org.openqa.selenium.WebDriver;
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
		driver.get("http://weibo.com");
		//WebElement aboutLink = driver.findElement(By.linkText("ÕÊºÅµÇÂ¼"));
		//aboutLink.click();
		Thread.sleep(2000);
	   driver.close();
	   driver.quit();
	}

}
