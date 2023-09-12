package asg.AssignmentAppium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

//1) Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator
public class Q_1 {
	@Test
	public void name() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("sahil3");
		options.setApp("D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(2000);
		
	}

}
