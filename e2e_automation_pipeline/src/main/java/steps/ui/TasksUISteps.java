package steps.ui;

import pages.HomePage;
import net.thucydides.core.annotations.Step;

public class TasksUISteps {
    public HomePage homePage;

    @Step
    public void AddNewTask()
    {
        homePage.addNewTask("Task 1");
    }
}