package asg.AssignmentAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

//Write an Appium Program to connect with Realdevice and open APIdemo.app application on your realdevice.
public class Q_2 {
	
	public void name() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO CPH2285");
		capabilities.setCapability(MobileCapabilityType.APP, "D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		
	}

}
