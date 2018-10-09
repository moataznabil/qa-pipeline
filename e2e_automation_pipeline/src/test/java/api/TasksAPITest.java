package api;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.api.TasksAPISteps;

@RunWith(SerenityRunner.class)
public class TasksAPITest {
    @Steps
    TasksAPISteps taskAPISteps;

    @Test
    @WithTag(type="type", name="API")
    public void verifyTasksWithAPI() {
        taskAPISteps.addNewTaskAPI();
    }
}
