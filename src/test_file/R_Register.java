package test_file;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class R_Register extends R_Base {
	@Test //Negative
	public void RegisteredEmail() throws InterruptedException, MalformedURLException {
		 AndroidDriver<AndroidElement> driver = Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(4000);
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		 //using coordinate
		 int x = 450;
		 int y = 1134;
		 TouchAction t = new TouchAction(driver);
		 t.tap(PointOption.point(x, y)).perform();
		 driver.findElementByXPath("//*[@text='Nama']").sendKeys("testerqe11");
		 driver.findElementByXPath("//*[@text='Email atau Nomor Telepon']").sendKeys("testerqe.ralali11@gmail.com");
		 driver.findElementByXPath("//*[@text='LANJUTKAN']").click();
		 String failmsg1 = driver.findElementByXPath("//*[@text='Email sudah terdaftar']").getText();
		 Assert.assertEquals("Email sudah terdaftar", failmsg1);
	}
	
	@Test //Positive
	public void UnregisteredEmail() throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(4000);
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		 //using coordinate
		 int x = 450;
		 int y = 1134;
		 TouchAction t = new TouchAction(driver);
		 t.tap(PointOption.point(x, y)).perform();
		 //NOTE, UNTUK DATA REGISTRASI MASIH HARDCODE, BELUM DIBUAT RANDOM STRING
		 driver.findElementByXPath("//*[@text='Nama']").sendKeys("testerqe13");
		 driver.findElementByXPath("//*[@text='Email atau Nomor Telepon']").sendKeys("testerqe.ralali13@gmail.com");
		 driver.findElementByXPath("//*[@text='LANJUTKAN']").click();
	}
}
