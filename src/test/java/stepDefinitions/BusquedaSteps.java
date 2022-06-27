package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.cucumber.junit.Base;
import io.cucumber.java.en.*;

public class BusquedaSteps extends Base {

	@Given("Ingreso a la pagina de youtube")
	public void ingreso_a_la_pagina_de_youtube() {
		chromeDriverConnection();
		driver.get("https://www.youtube.com/");
	}

	@When("ingreso mis datos")
	public void ingreso_mis_datos() throws InterruptedException {
		Thread.sleep(3000);
		WebElement buscar = findElement(By.xpath("//input[@id = 'search']"));
		buscar.sendKeys("Akira");
	}

	@Then("me muestra la pagina de principal de youtube")
	public void me_muestra_la_pagina_de_principal_de_youtube() throws InterruptedException {
		findElement(By.xpath("//button[@id = 'search-icon-legacy']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

	@Given("Ingreso a la pagina de facebook")
	public void ingreso_a_la_pagina_de_facebook() {
		System.out.println("1");
	}

	@When("ingr mis datos")
	public void ingr_mis_datos() {
		System.out.println("1");
	}

	@Then("me muestra la pagina de principal de facebook")
	public void me_muestra_la_pagina_de_principal_de_facebook() {
		System.out.println("1");
	}

	@Given("Ingreso a la pagina de linkenlin")
	public void ingreso_a_la_pagina_de_linkenlin() {
		System.out.println("1");
	}

	@When("ing mis datos")
	public void ing_mis_datos() {
		System.out.println("1");
	}

	@Then("me muestra la pagina de principal de linkenlin")
	public void me_muestra_la_pagina_de_principal_de_linkenlin() {
		System.out.println("1");
	}

	@Given("Ingreso a la pagina de Sunat")
	public void ingreso_a_la_pagina_de_sunat() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso 1");
	}

	@When("ingrso mis datos")
	public void ingrso_mis_datos() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso 2");
	}

	@Then("me muestra pagina principal de SUNAT")
	public void me_muestra_pagina_principal_de_sunat() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso 3");
	}

	@Given("Ingreso a la pagina de Tiktok")
	public void ingreso_a_la_pagina_de_tiktok() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso A");
	}

	@When("ingrso mis datoss")
	public void ingrso_mis_datoss() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso B");
	}

	@Then("me muestra pagina principal de tiktok")
	public void me_muestra_pagina_principal_de_tiktok() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Paso C");
	}

}
