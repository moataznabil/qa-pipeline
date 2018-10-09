# E2E automation pipeline with Serenity, Selenium, Rest Assured and Jenkins pipelines

This is a simple framework for automation tests pipeline with Serenity, Selenium, Rest Assured, Taurus and Jenkins Blue ocean" to give you a well built launch pad that you can use to give life to your own automation pipeline. 

For the Presentation you can find it in the this [link:](https://www.slideshare.net/mnabil2010/build-your-qa-pipeline-using-serenity-selenium-webdriver-rest-assured-and-jenkins-pipeline)

There is a list of prerequisites to run all the project tests:

- Java >= 1.8 version [installation link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

- Apache Maven >= 3.0 [installation link](https://maven.apache.org/install.html)

- Application under test (Tasks Application) [installation link](tasks-rest-api/README.md)

- Taurus [installation link](https://gettaurus.org/?utm_source=blog&utm_medium=BM_blog&utm_campaign=qa-automation-pipeline-learn-how-to-build-your-own)


With the help of Serenity framework and its ability to run tests by tags, you can run smoke, API and UI tests accordingly:

- `mvn clean verify -Dtags="type:Smoke"`
- `mvn clean verify -Dtags="type:API"`
- `mvn clean verify -Dtags="type:UI"`