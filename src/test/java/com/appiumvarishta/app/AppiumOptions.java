package com.appiumvarishta.app;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumOptions {
	public UiAutomator2Options getOptions() {
		System.out.println(":::::::::begin:::::::::::");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("builds/hindu.apk").getFile());
		String apkPath = file.getAbsolutePath();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options
			.setPlatformName("Android")
			.setPlatformVersion("8.1")
			.setAutomationName("UiAutomator2")
			.setDeviceName("emulator-5554")
			.setAppPackage("com.epaper.thehindu.android")
			.setAppActivity(".app.activities.HomePageActivity");

		return options;
	}
}
