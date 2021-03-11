package tests.users;

import pom.user.UserSteps;
import base.TestBase;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import restassured.RestAssuredResponse;

import static org.hamcrest.Matchers.notNullValue;

public class UserPutTests extends TestBase {

    @Test(description = "Updated user into database and return status code equals to 200 - Ok.")
    public void updateUser(){
        //Test Data
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "rmn restassured java tests");
        requestBody.put("job", "QA Automation");
        String parameter = "2";

        //Execute api request
        Response response = UserSteps.put(requestBody,parameter);

        // Response asserts
        RestAssuredResponse.statusCodeEqualsTo(response,200);
        RestAssuredResponse.responseBody(response,"updatedAt",notNullValue());

    }
}
