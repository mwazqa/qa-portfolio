package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DemoQaLoginApiTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://demoqa.com";
    }

    // testValidLogin()
    @Test
    public void testValidLogin() {

        String requestBody = """
                {
                    "userName": "testuser",
                    "password": "Test@123"
                }
                """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/Account/v1/Login")
                .then()
                .statusCode(200)
                .body("token", notNullValue())
                .body("username", equalTo("testuser"));
    }

    // testInvalidLogin()
    @Test
    public void testInvalidLogin() {

        String requestBody = """
                {
                    "userName": "invaliduser",
                    "password": "invalidpassword"
                }
                """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/Account/v1/Login")
                .then()
                .statusCode(401)
                .body("message", containsString("User not found"));
    }

    // testValidAndInvalidLogin()
    @Test
    public void testValidAndInvalidLogin() {

        // --- VALID ---
        String validRequest = """
                {
                    "userName": "testuser",
                    "password": "Test@123"
                }
                """;

        given()
                .contentType(ContentType.JSON)
                .body(validRequest)
                .when()
                .post("/Account/v1/Login")
                .then()
                .statusCode(200)
                .body("token", notNullValue());

        // --- INVALID ---
        String invalidRequest = """
                {
                    "userName": "invaliduser",
                    "password": "invalidpassword"
                }
                """;

        given()
                .contentType(ContentType.JSON)
                .body(invalidRequest)
                .when()
                .post("/Account/v1/Login")
                .then()
                .statusCode(401)
                .body("message", containsString("User not found"));
    }
}