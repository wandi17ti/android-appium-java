# Implement Automation Mobile using Appium Java

## Steps Configuration to run Mobile Automation
- Download Java and set JAVA_HOME
- Download [Android Studio](https://developer.android.com/studio)
- Set ANDROID_HOME path to SDK Location
- Download Node.js v12(LTS)
- Download [Appium Desktop & Appium Java Client](http://appium.io/downloads.html)
- Download [Selenium Java Client](https://www.selenium.dev/downloads/)
- Download [commons-lang3](https://commons.apache.org/proper/commons-lang/download_lang.cgi)
- Install Java IDE [Eclipse](https://www.eclipse.org/downloads/) and configure the Library
- Download [TestNG](https://testng.org/doc/download.html) for the framework 

## Inspect Element Tools

1. Appium Inspector
- Open Appium Desktop
- Start Server
- Start Inspector Session
- Create Desired capabilities and Start Session

2. Desired Capabilities
```
{
  "platformName": "android",
  "platformVersion": "9.0.0",
  "deviceName": "cbce97bd",
  "noReset": "True",
  "appPackage": "com.ralali",
  "appActivity": "com.ralali.MainActivity",
  "automationName": "Appium",
  "app": "/Users/macbook/eclipse-workspace/AppiumTutorial/src/ralali.apk"
}
```

### Getting apk file Ralali using APKPure
- Download APKPure on Playstore
- Open APKPure
- Click Ralali Apps
- Click Export

### Getting appPackage and appActivity on Desired Capabilities 
```
adb logcat > log.txt
```
when the code executed then press the ralali apps on phone, then terminate the code.
It will show the logcat on log.txt
- Open log.txt
- find "for activity" ralali

### If using Real Device, checking the devices already connected on laptop
```
adb devices
```
## How to Run
- Open Appium Server
- Start the server
- Run Java Appplication on Java IDE(Eclipse)

## Notes
Eksekusi code yang masih tidak stabil sehingga bisa terjadi error
