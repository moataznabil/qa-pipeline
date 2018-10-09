package ui;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.ui.TasksUISteps;

@RunWith(SerenityRunner.class)
public class TasksUITest {

    @Managed
    WebDriver driver;

    @Steps
    TasksUISteps tasksUISteps;

    @Test
    @WithTag(type="type", name="UI")
    public void  addTask()
    {
        tasksUISteps.AddNewTask();
    }
}