package base;

import helpers.ProjectHelpers;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {


    public static String urlBase;
    @BeforeSuite
    public void beforeSuite(){
        //Execute before all tests

        urlBase = ProjectHelpers.getProperty("url-base");
    }

    @BeforeMethod
    public void beforeMethod(Method method, ITestContext context){
        //Execute before current test
        Test test = method.getAnnotation(Test.class);

        System.out.println("Test Name: "+ method.getName());
        System.out.println("Test Description: "+ test.description());
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        //Execute after current test
        System.out.println("Execute after current tests");
    }

    @AfterSuite
    public void afterSuite(){
        //Execute after all tests
        System.out.println("Execute after all tests");
    }
}
