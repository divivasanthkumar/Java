package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Application {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dcap.setCapability("appPackage", "com.cricbuzz.android");
		dcap.setCapability("appActivity", "com.cricbuzz.android.lithium.app.view.activity.SplashActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driv = new AndroidDriver(url, dcap);
		Thread.sleep(1000);
		driv.findElement(By.id("")).click();

	}

}
