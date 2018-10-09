package steps.api;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class TasksPageAPISteps {

    @Step
    public void verifyThatAppIsRunning() {
        given()
                .get("http://localhost:8080")
                .then()
                .statusCode(200);
    }
}