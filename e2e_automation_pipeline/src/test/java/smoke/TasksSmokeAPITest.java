package smoke;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.api.TasksPageAPISteps;

@RunWith(SerenityRunner.class)
public class TasksSmokeAPITest {

    @Steps
    TasksPageAPISteps taskAPISteps;

    @Test
    @WithTag(type="type", name="Smoke")
    public void verifyTasksWithAPI() {
        taskAPISteps.verifyThatAppIsRunning();
    }
}
