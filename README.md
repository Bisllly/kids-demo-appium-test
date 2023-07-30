# demo-appium-test

You need to install Appium, and Android Studio Emulator locally.

After installing those, you might run:
```java
appium
```
to start Appium server.

Then open Android studio and pick an emulator, after that you might check the name of the emulator using 
```java
adb devices
```

Then you might run 
```java
mvn clean verify
```
to start the script.

