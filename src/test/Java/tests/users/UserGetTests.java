package tests.users;

import pom.user.UserSteps;
import base.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import restassured.RestAssuredResponse;

import static org.hamcrest.Matchers.notNullValue;

public class UserGetTests extends TestBase {

    @Test(description = "Listed all users to database and return status code equals to 200.")
    public void getAllUsers() {

        //Execute api request
        Response response = UserSteps.get();

        //Response asserts
        RestAssuredResponse.statusCodeEqualsTo(response, 200);
        RestAssuredResponse.responseBody(response, "data.id[0]", notNullValue());
        RestAssuredResponse.responseBody(response, "data.email[0]", notNullValue());
        RestAssuredResponse.responseBody(response, "data.first_name[0]", notNullValue());
        RestAssuredResponse.responseBody(response, "data.last_name[0]", notNullValue());
        RestAssuredResponse.responseBody(response, "data.avatar[0]", notNullValue());
    }

    @Test(description = "Listed user by ID to database and return status code equals to 200.")
    public void getUserById() {

        //Execute api request
        Response response = UserSteps.getById("2");

        //Response asserts
        RestAssuredResponse.statusCodeEqualsTo(response, 200);
        RestAssuredResponse.responseBody(response, "data.id", notNullValue());
        RestAssuredResponse.responseBody(response, "data.email", notNullValue());
        RestAssuredResponse.responseBody(response, "data.first_name", notNullValue());
        RestAssuredResponse.responseBody(response, "data.last_name", notNullValue());
        RestAssuredResponse.responseBody(response, "data.avatar", notNullValue());
    }
}
