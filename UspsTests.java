package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.libraries.Base;

public class UspsTests extends Base {
	
	@Test
	public void hoverOverTest() {
		
		String url = "https://www.usps.com/";
		driver.get(url);
		
		WebElement quickToolElem = driver.findElement(By.partialLinkText("Quick Too"));
		myLibGS.highlightwebElement(quickToolElem);
		Actions actions = new Actions(driver);
		actions.moveToElement(quickToolElem).build().perform();
		// Thread.sleep(5*100);
		myLibGS.customWait(1);
		// String trackingPackageCss="#g-navigation > div > nav > ul >
		// li.qt-nav.menuheader> div > ul > li:nth-child(1) > a";
		// WebElement
		// trackPacElem=driver.findElement(By.cssSelector(trackingPackageCss));
		// WebElement trackPacElem=driver.findElement(By.partialLinkText("Track a
		// Packa"));
		WebElement trackPacElem = driver.findElement(By.linkText("Track a Package"));
		// actions.moveToElement(trackPacElem).click().build().perform();
		myLibGS.highlightwebElement(trackPacElem);

		actions.moveToElement(trackPacElem).build().perform();
		myLibGS.customWait(3);

		trackPacElem.click();

	}

	

}
