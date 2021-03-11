package tests.users;

import pom.user.UserSteps;
import base.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import restassured.RestAssuredResponse;
import static org.hamcrest.Matchers.blankString;

public class UserDeleteTests extends TestBase {

    @Test(description = "Deleted user data and return status code equals to 204.")
    public void deleteUser(){
        // Test Data
        String parameter = "2";

        //Execute api request
        Response response = UserSteps.delete(parameter);

        //Response Asserts
        RestAssuredResponse.statusCodeEqualsTo(response,204);
        RestAssuredResponse.responseBody(response,blankString());
    }

}
