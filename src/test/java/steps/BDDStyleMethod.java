package steps;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

public class BDDStyleMethod {


    public static void SimpleGETpost(String postNumber){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/posts/%s",postNumber))
                .then().body("title", is("a title"));
    }

    public static void performContainsCollections(){
        given()
                .contentType(ContentType.JSON)
        .when()
                .get("http://localhost:3000/posts/")
        .then()
                .body("title", containsInAnyOrder("a title","another title","book title",null))
                .statusCode(200);
    }

    public static void performPathParameter() {
        given()
                .contentType(ContentType.JSON)
        .with()
                .pathParams("post",1)
        .when()
                .get("http://localhost:3000/posts/{post}")
        .then()
                .body("title", containsString("a title"))
                .statusCode(200);
    }


    public static void performQueryParameter() {
        given()
                .contentType(ContentType.JSON)
        .with()
                .queryParam("id",1)
        .when()
                .get("http://localhost:3000/posts/")
        .then()
                .body("title", hasItem("a title"))
                .statusCode(200);
    }

}
