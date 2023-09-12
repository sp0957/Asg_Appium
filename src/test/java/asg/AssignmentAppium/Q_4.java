package asg.AssignmentAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Base.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

//Write an Appium Program to connect with emulator and open APIdemo.app to perform swipe demo to swipe the menu.

public class Q_4  extends BaseClass {
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("sahil3");
		options.setApp("D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		swipeAction(el, "left" , driver);
			
		}
	}


