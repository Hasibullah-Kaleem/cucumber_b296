package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {


//
//    @Before("@pr_iphone or @pr_tesla")
//    public void doSomething(){
//
//
//        // Do something before each scenario
//    }



    @Before
    public void setUp(){


        System.out.println("Before hook executed...");

        //We can add some credetentials to setup our test cases such as Api credentials, db credentials
    }



    @After
    public void tearDown(Scenario scenario) {

        //We can add some methods to close driver and disconnect from Db.....
        //We can add screenshot methods that provide to attach into the Report.......
        System.out.println("After hooks everything closed.....");

        //if the test cases/scenario fails , then we can capture the Screenshot and attacht into the report automatically
        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "failed_screenshot");

            Driver.closeDriver();
        }

//
//        //we can conditional hook using cucumber tags
//
//        @After("@pr_iphone or @pr_tesla")
//        public void afterAllTearDown(){
//
//            System.out.println("this run only after specific tags.......");
//
//        }
//
    }

}