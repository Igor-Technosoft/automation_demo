
Hi there,

Thanks for the opportunity to work on this project - it was a lot of fun!

The following are the explanation and instructions on how to run this framework.

I decided to go with my existing framework Maven/Java/Cucumber/SeleniumWeb Driver.

There’s a feature file called computerdatabasehomepage.feature which contains 1 Feature and 5 Scenarios.

The 4 Scenarios cover the basic CRUD functionalities and 1 Scenario covers searching for a non-existing computer. This feature will run under 1 tag, tags = {"@computer-database"}  for true E2E tests where each Scenario starts from Home page. You’ll see some redundancy in step definitions as these Scenarios could also be adjusted to run on their own.

There’s ComputerDatabaseHomePage.java which contains all the locators and methods needed to run the Scenarios. This class inherits from BasePage.java which contains Driver wait and other commonly used methods.  There’s also  ComputerDatabaseHomePageSD.java which contains step definitions for  computerdatabasehomepage.feature.  

SharedSD contains Global variables to run cross-browser tests either from command line or from IntelliJ.

As you can see there are other feature files and other files, these are part of my testing framework which I use to automate non-work-related sites. You can ignore these files. 

This Framework also has pom.xml, ConfirReader and configproperties, to host various drivers and url’s.

I use an Allure plug-in to produce reports. There are a few  ways to run this framework. 

First, from Maven/IntelliJ import the attached cucumber_demo_framework into Maven, to install Maven, https://www.code2bits.com/how-to-install-maven-on-macos-using-homebrew/

Once installed, go to TestRunner.java and right click to run run TestRunner.

Note: the browsers won’t close automatically for demo purposes.

Second, from command line: cd to cucumber_demo_framework, then mvn clean test to run on Chrome, 
mvn clean test  -DBROWSER=firefox to run on Firefox, don’t run on Safari, need to update Safari driver

Once you see all 5 Scenarios run, man site to produce Allure report. 
Then go to Maven - target - allure-results - allure-maven-plugin - right click on index.html - select Open in Browser - Chrome. You’ll see an Allure report for all Scenarios.

Third, optional, install Jenkins, https://jenkins.io/download/, then setup a Maven Project.
Once setup, run the job and look at Allure report. 

Github link to this project to review:

https://github.com/Igor-Technosoft/automation_demo/tree/master/cucumber_demo_framework


