package com.sophos.business;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class ConsultarTrabajos {

	public void SearchJobs(WebDriver driver) {
		try {
		
			Thread.sleep(100);
			System.out.println("Paso");
			driver.findElement(By.id("sgpb-popup-dialog-main-div")).click();
			Thread.sleep(9000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.close();
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);
			driver.findElement(By.id("mega-menu-item-1541")).click();
			Thread.sleep(500);
		}catch (Exception e) {
			System.out.println("Error al dar clic en trabaja con nosotros");
		}
	}
	
}
