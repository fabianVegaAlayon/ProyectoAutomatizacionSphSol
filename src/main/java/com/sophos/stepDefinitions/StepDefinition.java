package com.sophos.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import com.sophos.business.*;
import com.sophos.data.*;

public class StepDefinition {
	WebDriver db; 
	
	@Given("^Se quiere ingresar a la pagina$")
	public void se_quiere_ingresar_a_la_pagina() throws Throwable {
		
		db = DriverConfiguration.Configdriver();
		AbrirNavegador App = new AbrirNavegador();
    	App.AbrirNav(db);
        System.out.print("Abre la url de la pagina ");	
	    //throw new PendingException();
	}

	@When("^Se necesita de consultar las ofertas laborales$")
	public void se_necesita_de_consultar_las_ofertas_laborales() throws Throwable {
		ConsultarTrabajos consultarT = new ConsultarTrabajos();
		consultarT.SearchJobs(db);
		System.out.print("Se da clic en consultar oferta");	
		//throw new PendingException();
	}

	
	@Then("^Se captura la informacion de las ofertas$")
	public void se_captura_la_informaci_n_de_las_ofertas() throws Throwable {
		ObtenerInformacion consultarT = new ObtenerInformacion();
		consultarT.ObtenerInfo(db);
        System.out.print("Se obtiene la información de la oferta");					
	    //throw new PendingException();
        db.quit();
	}
}
