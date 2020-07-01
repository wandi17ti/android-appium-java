package test_file;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class R_Base {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	    // TODO Auto-generated method stub

	    //Appium code
	    
	    File f = new File("src");
	    File fs = new File(f,"ralali.apk");
	    
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "cbce97bd");
	    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,0);
	    AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
	}
}
