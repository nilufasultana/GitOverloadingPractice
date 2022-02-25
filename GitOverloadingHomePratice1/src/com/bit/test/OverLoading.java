package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverLoading {
public  WebDriver dr ;
public void clickOnAnyElement(By by)	{
	dr.findElement(by).click();
}
public void clickOnAnyElement(WebElement ele)	{//type
	//dr.findElement(by).
	ele.click();
}

public void clickOnAnyElement(By by, String value) {// size
   dr.findElement(by).click();
}
public void clickOnAnyElement(String value,By by) {//sequence
dr.findElement(by).click();	
}
public void getAnyText(By by, String expectedText) {
	String actualText = dr.findElement(by).getText();
	if(actualText.equals(expectedText)) {
		System.out.println("Pass: Text is accurate");
	}
	else {
		System.out.println("Fail : text did not match : " + by);
	}
}


public void getAnyText(By by,String expectedText,int zip) {//size
String actualtext=dr.findElement(by).getText();
if(actualtext.equals(expectedText)) {
System.out.println("pass: Text is accurate");	
}
else {
	System.out.println("Fail:text did not match"+by);
}
}
public void getAnyText( String expectedText, By by) {// Sequence
	String actualText = dr.findElement(by).getText();
	if(actualText.equals(expectedText)) {
		System.out.println("Pass: Text is accurate");
	}
	else {
		System.out.println("Fail : text did not match : " + by);
	}
}

public void getAnyText(By by, String expectedText, long zip) { // type
	String actualText = dr.findElement(by).getText();
	if(actualText.equals(expectedText)) {
		System.out.println("Pass: Text is accurate");
	}
	else {
		System.out.println("Fail : text did not match : " + by);
	}
}
}
