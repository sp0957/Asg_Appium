package asg.AssignmentAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

//Write an Appium Program to connect with emulator wit ecommerce based application using Generalstore.app to perform locators like name, dropdown etc.

public class Q_3 {
	@Test
	public void name() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("sahil3");
		options.setApp("D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\General-Store.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello Tester..");
		Thread.sleep(2000);
		
		
	}

}
