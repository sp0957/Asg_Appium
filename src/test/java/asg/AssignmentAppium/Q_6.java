package asg.AssignmentAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

//Write an Appium Program to connect with realdevice using APIDemo.app to perform scrolling the all option.
public class Q_6 {
	@Test
	public void name() throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, "D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO CPH2285");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
        Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
		Thread.sleep(3000);
		
	}

}
