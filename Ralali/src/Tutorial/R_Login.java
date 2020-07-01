package Tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class R_Login extends R_Base{
	@Test //Negative
	public void InvalidEmail() throws InterruptedException, MalformedURLException {
		 AndroidDriver<AndroidElement> driver = Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(8000);
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		 driver.findElementByClassName("android.widget.EditText").sendKeys("abc123@gmail.com");
		 driver.findElementByXPath("//*[@text='LANJUTKAN']").click();
		 String failmsg1 = driver.findElementByXPath("//*[@text='Email belum terdaftar']").getText();
		 Assert.assertEquals("Email belum terdaftar", failmsg1);
	}
	
	@Test //Positive
	public void ValidEmail() throws InterruptedException, MalformedURLException {
		 AndroidDriver<AndroidElement> driver = Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(8000);
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		 driver.findElementByClassName("android.widget.EditText").sendKeys("testerqe.ralali11@gmail.com");
		 driver.findElementByXPath("//*[@text='LANJUTKAN']").click();
		 driver.findElementByClassName("android.widget.EditText").sendKeys("testerqe11");
		 driver.findElementByXPath("//*[@text='MASUK']").click();
		 String success = driver.findElementByXPath("//*[@text='Tester QE Ralali 11']").getText();
		 Assert.assertEquals("Tester QE Ralali 11", success);
	}
}
