package Tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class R_Checkout extends R_Base {
	@Test //Positive
	public void CheckoutSKU() throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(8000);
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileTab\"]").click();
		 driver.findElementByClassName("android.widget.EditText").sendKeys("testerqe.ralali08@gmail.com");
		 driver.findElementByXPath("//*[@text='LANJUTKAN']").click();
		 driver.findElementByClassName("android.widget.EditText").sendKeys("testerqe08");
		 driver.findElementByXPath("//*[@text='MASUK']").click();
		 String success = driver.findElementByXPath("//*[@text='Tester QE Ralali 08']").getText();
		 Assert.assertEquals("Tester QE Ralali 08", success);
		 
		 driver.findElementByXPath("//*[@text='Home']").click();
		 driver.findElementByXPath("//*[@text='Apa kebutuhan bisnis Anda?']").click();
		 driver.findElementByXPath("//*[@text='Apa kebutuhan bisnis Anda?']").sendKeys("Gula Pasir");
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ENTER).perform();
		 driver.findElementByXPath("//*[@text='ROSEBRAND Gula Pasir 1KG']").click();
		 driver.findElementByXPath("//*[@text='BELI SEKARANG']").click();
		 driver.findElementByXPath("//*[@text='TAMBAH BELANJAAN']").click();
		 driver.findElementByXPath("//*[@text='CHECKOUT']").click();
		 driver.findElementByXPath("//*[@text='BAYAR']").click();
		 driver.findElementByXPath("//*[@text='Transfer Bank']").click();
		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]").click();
		 driver.findElementByXPath("//*[@text='BUAT PESANAN']").click();
		 String confirm = driver.findElementByXPath("//*[@text='Batas waktu pelunasan pembayaran']").getText();
		 Assert.assertEquals("Batas waktu pelunasan pembayaran", confirm);
		 
		 
	}
}
