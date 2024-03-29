# Implement Automation Mobile using Appium Java on Mac

## Steps Configuration to run Mobile Automation (Manual)
- Download Java and set JAVA_HOME
- Download [Android Studio](https://developer.android.com/studio)
- Set ANDROID_HOME path to SDK Location
- Download Node.js v12(LTS)
- Download [Appium Desktop](http://appium.io/downloads.html)
- Install Java IDE [Eclipse](https://www.eclipse.org/downloads/)

## Library that needed
- Download [Selenium Java Client](https://www.selenium.dev/downloads/)
- Download [Appium Java Client](http://appium.io/downloads.html)
- Download [commons-lang3](https://commons.apache.org/proper/commons-lang/download_lang.cgi)
- Download [TestNG](https://testng.org/doc/download.html)

## How to setup
- Clone repository
- Open Project with Eclipse
- Right Click on Project > Properties > Java Build Path > Add External JARs
- Import all Library tha downloaded (only file jar)
- Then when see error tag @Test, point cursor to @Test > Add TestNG Library

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

or using APKInfo

### Checking the devices already connected on laptop
```
adb devices
```
### if using Real Device, set to Developer Option and enable USD Debugging


## How to Run using Framework TestNG
- Make sure Appium Server is Started
- Run testng.xml to run the code on JAVA IDE (Eclipse)

Before running test, read this documentation<br/>
Reference :
https://testng.org/doc/documentation-main.html#running-testng

## Notes
- Eksekusi code yang masih tidak stabil sehingga bisa terjadi error
- Kodingan yang masih hard coding
