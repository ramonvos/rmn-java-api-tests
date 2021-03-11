package tests.users;

import pom.user.UserSteps;
import base.TestBase;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import restassured.RestAssuredResponse;

import static org.hamcrest.Matchers.notNullValue;

public class UserPostTests extends TestBase {

    @Test(description = "Created new user into database and return status code equals to 201 - Created.")
    public void createNewUser(){

        //Test Data
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "rmn restassured java tests");
        requestBody.put("job", "QA Automation");

        //Execute api request
        Response response = UserSteps.post(requestBody);

        // Response asserts
        RestAssuredResponse.statusCodeEqualsTo(response,201);
        RestAssuredResponse.responseBody(response,"id",notNullValue());
        RestAssuredResponse.responseBody(response,"createdAt",notNullValue());
    }
}
