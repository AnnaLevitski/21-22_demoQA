package manager;

import models.StudentDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface HelperStudent extends HalperBase{
    By tabElements = By.cssSelector("div[class='category-cards']:first-child");
    By buttonForms = By.xpath("//div[text()='Forms']");
    By buttonPractisForms = By.xpath("//span[text()='Practice Form']");
    By inputFirstName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By inputUserEmail = By.id("userEmail");
    By inputUserNumber = By.id("userNumber");
    By inputDateOfBirth = By.id("dateOfBirthInput");
    By inputSubjects = By.id("subjectsInput");
    By checkBoxSport = By.cssSelector("label[for='hobbies-checkbox-1']");
    By checkBoxReading = By.cssSelector("label[for='hobbies-checkbox-2']");
    By checkBoxMusic = By.cssSelector("label[for='hobbies-checkbox-3']");
    By inputAddress = By.id("currentAddress");
    By dorpBoxState = By.id("react-select-3-input");
    By dorpBoxCity = By.id("react-select-4-input");
    By buttinSubmit = By.id("submit");
    By textSuccses = By.id("example-modal-sizes-title-lg");
    WebElement elementEmail = wd.findElement(By.xpath("//tbody/tr[2]/td[2]"));
    WebElement elementPhone = wd.findElement(By.xpath("//tbody/tr[4]/td[2]"));


    default void selectPractisForm(){
        clikBase(tabElements);
        clikBase(buttonForms);
        clikBase(buttonPractisForms);
    }
    default void fillStudentForm(StudentDTO student){
        type(inputFirstName, student.getFirstName());
        type(inputLastName, student.getLastName());
        type(inputUserEmail, student.getEmail());
        selectGender(student.getGender());
        type(inputUserNumber, student.getMobile());
        typeBDByKeys(inputDateOfBirth, student.getDateOfBitht());
        addSubject(inputSubjects, student.getSubgects());
        selectHobby(student.getHobbies());
        type(inputAddress, student.getCurrentAddress());
        fillDropBox(dorpBoxState, "Haryana");
        fillDropBox(dorpBoxCity, "Karnal");
        clikBase(buttinSubmit);

    }
    default boolean isElementPresent_Success(){
        return isElementPresent(textSuccses);
    }
    default void closeForm(){
        clikBase(By.id("closeLargeModal"));
    }
    default void selectHobby(String hobbies){
        switch (hobbies){
            case "Sports":
                clikBase(checkBoxSport);
                break;
            case "Reading":
                clikBase(checkBoxReading);
                break;
            case "Music":
                clikBase(checkBoxMusic);
                break;

        }
    }

    default void addSubject(By inputSubjects, String subgects){
        String[] splitSubg = subgects.split(",");
        clikBase(inputSubjects);
        for(String subj : splitSubg){
            wd.findElement(inputSubjects).sendKeys(subj);
            wd.findElement(inputSubjects).sendKeys(Keys.ENTER);
        }
    }

    default void typeBDByKeys(By inputDateOfBirth, String dateOfBitht){
        WebElement element = wd.findElement(inputDateOfBirth);
        element.click();
        String opirationSystem = System.getProperty("os.name");
        System.out.println("SO -->" + opirationSystem);
        if(opirationSystem.startsWith("Win")){
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        }else {
            element.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        }
        element.sendKeys(dateOfBitht);
        element.sendKeys(Keys.ENTER);

    }

    default void selectGender(String gender){
        if(gender.equalsIgnoreCase("Male")){
            clikBase(By.cssSelector("label[for='gender-radio-1']"));
        }else if(gender.equalsIgnoreCase("Female")){
            clikBase(By.cssSelector("label[for='gender-radio-2']"));
        }else {
            clikBase(By.cssSelector("label[for='gender-radio-3']"));
        }
    }


}

