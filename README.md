# web-java-cucumber
Test Automation framework for Web applications using Java + Cucumber


This Test Automation Framework was developed using the following technologies:
* Gradle
* Java
* Selenium
* Cucumber
* TestNG
* Logback

### Pre-conditions to run the automated scenarios locally
You will need to have:
1. **Google Chrome** installed in your machine, preferably version 73;
2. Any **IDE** for Java to run the tests;
3. **JAVA_JDK** configured;
4. **Cucumber plugin** installed in your IDE.

### How the project is structured
The project is using PageObject and PageFactory patterns. Was developed using the Mac OS operating system but is ready 
to run on Windows, Linux and Mac OS operating systems.
- The `main` class files are in `src/main/java/` directory. You will see the packages `elements`, `pages`, `setup` and `utils`.
- There is a file **project.properties** in `src/main/resources/` to get all data used on the tests;
- The `tests` files are in `src/test/java/` and when you execute a scenario, a **log** file is generated 
under `src/main/java/resources/logs/` and a HTML report called **index.html** is generated in `src/test/resources/cucumber-reports/`.
- All **feature** files are in `src/test/resources/features/`.
- In case of scenario failure, one screenshot is saved in `src/main/java/resources/screenshots/` inside a folder with the 
scenario name and the current date.

### How to Run the tests
1. Clone or download this repo to your machine;
2. Enable auto-import gradle option and wait gradle finalize the imports;
3. Go to `src/test/java`. You will see 3 Test classes. 
  - If you want to run just the Scenario 1, run the file **CheckoutTests**;
  - If you want to run just the Scenario 2, run the file **LoginTests**;
  - If you want to run all of them, run the file **AllTests**.
  
### 1. In case of problems with Chromedriver
In case of any problem when executing a test file, check the chromedriver path to your OS in `src/main/resources/project.properties`.
When using Mac OS, you can receive a message that the chromedriver is not executable. To fix this message, run the following line in your terminal under the chromedriver folder in the project (`src/main/resources/drivers/`):
```
chmod +x chromedriver_mac64
```

### 2. In case of problems with Logback imports when using Intellij
Go to any Page file and click to fix the import error. Click on `Add library 'Gradle: org.slf4j:slf4j-api:1.7.25' to classpath`.

### 3. In case of problems with Intellij
Try the following option:
```
File -> Invalidate Caches / Restart...
