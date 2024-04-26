package com.appiumvarishta.app;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class BasicFlowLaunch {
	public void testBasicFlow() {
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Downloads']")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Favorites']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.epaper.thehindu.android:id/navigation_bar_item_small_label_view' and @text='Daily Quiz']")).click();
	}
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		AppiumOptions options = new AppiumOptions();
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),
				options.getOptions());

		BasicFlowLaunch obj = new BasicFlowLaunch();
		obj.testBasicFlow();
		System.out.println("::::::::: end :::::::::::");

	}
}
