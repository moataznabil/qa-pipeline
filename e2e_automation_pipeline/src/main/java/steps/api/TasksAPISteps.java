package steps.api;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class TasksAPISteps {

    @Step
    public void addNewTaskAPI() {

        JSONObject payload = new JSONObject();
        payload.put("description","API Task 3") ;

        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(payload.toString())
                .post("http://localhost:8080/api/tasks")
                .then()
                .statusCode(201)
                .log()
                .all();
    }
}