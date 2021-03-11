package restassured;

import io.restassured.response.Response;
import org.hamcrest.Matcher;

public class RestAssuredResponse {

    public static void statusCodeEqualsTo(Response response, int statusCode) {

        response.then().assertThat().statusCode(statusCode);
    }

    public static void responseBody(Response response, String actualValue, Matcher expectedValue) {

        response.then().assertThat().body(actualValue, expectedValue);
    }
    public static void responseBody(Response response,  Matcher expectedValue) {

        response.then().assertThat().body(expectedValue);
    }
}
