package com.sophos.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfiguration {
	
	public static WebDriver Configdriver() {
		/*Este bloque se realiza dado que tengo el 
		 * chrome canary no el chorme normal, por eso no encuentra los binarios por default*/
		ChromeOptions chOp = new ChromeOptions();
		chOp.setBinary("C://Users//Duvan//AppData//Local//Google//Chrome SxS//Application//Chrome.exe");
		WebDriver driver = new ChromeDriver(chOp);
		/*Fin bloque*/
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");	
		return driver;
	}
}
