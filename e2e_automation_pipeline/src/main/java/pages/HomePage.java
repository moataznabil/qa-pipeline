package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    @FindBy(css = "input.ng-pristine.ng-invalid.ng-touched")
    public WebElement addNewTaskText ;

    @FindBy(className = "add")
    public WebElement addTaskButton ;

    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public void addNewTask(String taskName)
    {
        addNewTaskText.sendKeys(taskName);
        addTaskButton.click();
    }
}