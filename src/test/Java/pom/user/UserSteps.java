package pom.user;

import base.TestBase;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class UserSteps {


    private static String uriUser = TestBase.urlBase+ "users/";
    public static Response get(){

        Response response = given().when().get(uriUser).then().extract().response();

        System.out.println(response.getBody().asPrettyString());
        return response;
    }

    public static Response getById(String parameter){

        Response response = given().when().get(uriUser+parameter).then().extract().response();

        System.out.println(response.getBody().asPrettyString());
        return response;
    }
    public static Response post(JSONObject jsonObject){

        Response response = given().body(jsonObject).when().post(uriUser).then().extract().response();

        System.out.println(response.getBody().asPrettyString());
        return response;
    }

    public static Response put(JSONObject jsonObject, String parameter){

        Response response = given().body(jsonObject).when().put(uriUser+parameter).then().extract().response();

        System.out.println(response.getBody().asPrettyString());
        return response;
    }

    public static Response delete(String parameter){

        Response response = given().when().delete(uriUser+parameter).then().extract().response();

        System.out.println(response.getBody().asPrettyString());
        return response;
    }
}
