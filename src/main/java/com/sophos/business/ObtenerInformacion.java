package com.sophos.business;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ObtenerInformacion {
	
	public void ObtenerInfo(WebDriver driver) {
		int counter = 0;
		int counterSig =6;
		for (int i=1;i<10;i++) {
			try {
				String xpathNombre = "/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+i+"]/div/div[2]/div[1]/div/h3/a";
				String xpathFecha = "/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+i+"]/div/div[2]/div[1]/div/div/span/span";
				String xpathDescripción = "/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+i+"]/div/div[2]/div[2]";
				String fecha = driver.findElement(By.xpath(xpathFecha)).getText();
				String nombre = driver.findElement(By.xpath(xpathNombre)).getText();
				String descripcion = driver.findElement(By.xpath(xpathDescripción)).getText();
				counter++;
				System.out.println("Propuesta # " + counter);
				System.out.println("Nombre: " + nombre );
				System.out.println("Fecha: " + fecha);
				System.out.println("Descripción: " + descripcion + " \n");
				if(i==9) {
					String buttonSiguiente = "/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[2]/ul/li["+counterSig+"]/a";
					driver.findElement(By.xpath(buttonSiguiente)).click();
					i=0;
					counterSig++;
				}
				
			}catch (Exception e) {
				System.out.println("No hay mas información");
			}
		}

	}
}
