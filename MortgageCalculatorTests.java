package com.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.libraries.Base;

public class MortgageCalculatorTests extends Base {
	// website url
	private String websiteUrl = "https://www.mortgagecalculator.net/";

	// test method
	@Test
	public void buyATownHome() throws InterruptedException {
		// goto website
		driver.get(websiteUrl);
		myLibGS.customWait(3);

		// selenium/driver gets website title
		String websiteTitle = driver.getTitle();

		System.out.println("Actual website title is: " + websiteTitle);

		// compares actual website title VS expected website title,
		// if different, test fails and stops here.
		// if same, then test continues.
		assertEquals(websiteTitle, "Mortgage Calculator 2022 - FREE Calculator Tool (ZERO Ads)");
		
		//WebElement amountElm = driver.findElement(By.id("amount"));
		//amountElm.clear();
		//amountElm.sendKeys("450000");
		// above three lines converted into below one line
		myLibGS.enterText(By.id("amount"), "450000");
		//WebElement amortYearElem= driver.findElement(By.cssSelector("#amortizationYears"));
		//amortYearElem.clear();
		//amortYearElem.sendKeys("29");
		myLibGS.enterText(By.cssSelector("#amortizationYears"), "29");
		//locate amortMonth element
		/*
		 * WebElement amortMonthElem=
		 * driver.findElement(By.xpath("//*[@id='amortizationMonths']"));
		 * amortMonthElem.clear(); amortMonthElem.sendKeys("12");
		 */
		
		myLibGS.enterText(By.xpath("//*[@id='amortizationMonths']"), "12");
		//locate Intersst year term element
//		WebElement intTerm=driver.findElement(By.id("interestTermYears"));
//		intTerm.clear();
//		intTerm.sendKeys("30");
		myLibGS.enterText(By.id("interestTermYears"), "30");
		//locate interest month element
//		WebElement intMonth=driver.findElement(By.cssSelector("#interestTermMonths"));
//		intMonth.clear();
//		intMonth.sendKeys("1");
		myLibGS.enterText(By.cssSelector("#interestTermMonths"), "1");
		//locate interest type dropdown element
//		WebElement intTypeElem= driver.findElement(By.cssSelector("#interestType"));
//		Select intTypeSelect=new Select(intTypeElem);
//		intTypeSelect.selectByVisibleText("Fixed");
		myLibGS.selectDropDown(By.name("interestType"), "Fixed");
		//locates interest rate
//		WebElement intRateLoc=driver.findElement(By.xpath("//*[@id='rate']"));
//		intRateLoc.clear();
//		intRateLoc.sendKeys("5.5");
		myLibGS.enterText(By.xpath("//*[@id='rate']"), "5.5");
		//locate start month
//		WebElement startMonthDrop=driver.findElement(By.id("startMonth"));
//		Select startMonthSelect=new Select(startMonthDrop);
//		startMonthSelect.selectByVisibleText("10");
		myLibGS.selectDropDown(By.name("startMonth"), "10");
		
//		WebElement startYearDrop=driver.findElement(By.id("startYear"));
//		Select starYearSelect=new Select(startYearDrop);
//		starYearSelect.selectByVisibleText("2023");
		myLibGS.selectDropDown(By.id("startYear"), "2023");
		//payment Method
//		WebElement paymentMethodDrop=driver.findElement(By.cssSelector("#paymentMode"));
//		Select paymentMethodSelect=new Select(paymentMethodDrop);
//		paymentMethodSelect.selectByVisibleText("Semi-Monthly");
		myLibGS.selectDropDown(By.cssSelector("#paymentMode"), "Semi-Monthly");
		
		myLibGS.takeScreenshot("MorgageCal_InputData");
		//click on button
//		WebElement button=driver.findElement(By.cssSelector("#button"));
//		button.click();
		
		myLibGS.clickElement(By.cssSelector("#button"));
		Thread.sleep(5 * 1000);
		myLibGS.takeScreenshot("MorgageCal_Result");
		
		//........................
		WebElement monthlyPayment=driver.findElement(By.cssSelector("#summaryMonthly"));
		String totalMonthlyPayment=monthlyPayment.getAttribute("value");
		System.out.println("total is: "+totalMonthlyPayment);
		//myLibGS.selectDropDown(By.cssSelector("#summaryMonthly"), "value");
		
		myLibGS.customWait(3);

		// close A browser and Selenium/driver object is alive
		//driver.close();

		// close current browser and selenium/driver object is terminated
		//driver.quit();
	
		
	}

}