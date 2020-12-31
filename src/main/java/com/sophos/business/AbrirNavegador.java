package com.sophos.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class AbrirNavegador {

	
    public void AbrirNav(WebDriver driver) {			
        driver.manage().window().maximize();			
        driver.get("https://www.sophossolutions.com/");	
    }
}
