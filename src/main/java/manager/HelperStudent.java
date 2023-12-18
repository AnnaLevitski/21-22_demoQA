package manager;

import models.StudentDTO;
import org.openqa.selenium.By;

public interface HelperStudent extends HalperBase{
    By tabElements = By.cssSelector("div[class='category-cards']:first-child");
    By buttonForms = By.xpath("//div[text()='Forms']");
    By buttonPractisForms = By.xpath("//span[text()='Practice Form']");
    By inputFirstName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By inputUserEmail = By.id("userEmail");

    default void selectPractisForm(){
        clikBase(tabElements);
        clikBase(buttonForms);
        clikBase(buttonPractisForms);
    }
    default void fillStudentForm(StudentDTO student){
        type(inputFirstName, student.getFirstName());
        type(inputLastName, student.getLastName());
        type(inputUserEmail, student.getEmail());
    }


}

