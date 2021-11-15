# BunningsTest
Gradle based framework to test search feature.

Tools Used - 

1. Build Tool - Gradle
2. Automation - Selenium web driver , Cucumber 
3. Progamming Language - Java
4. Browser tested - Chromedriver

To start the execution run the command Gradle cucumber -t @search

It will trigger the 3 scenarios mention in search.feature file

To view the scenario mention in search.feature file , Go to src/test/resources
To view the step deifinion for feature, Go to src/test/stepDefinion
To view the selenium config set up, Go to src/main/Java/Core/UIModule


Results are updated in target folder. Cucumber run report will generate in target folder.

