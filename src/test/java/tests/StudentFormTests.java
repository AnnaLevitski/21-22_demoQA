package tests;

import manager.HelperStudent;
import models.StudentDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentFormTests extends TestBase implements HelperStudent {
    SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void goToForm() {
        selectPractisForm();
    }
    @Test
    public void regFormPositiveTest(){
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Sports",
                "J.Washington street, 10", "NCR", "Delphi");
        hideFooter();
        fillStudentForm(student);
        Assert.assertTrue(isElementPresent_Success());

    }
    @Test
    public void regFormPositiveTest_WithSoftAssert(){
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Sports",
                "J.Washington street, 10", "NCR", "Delphi");
        hideFooter();
        fillStudentForm(student);
        softAssert.assertTrue(isElementPresent_Success());
        softAssert.assertEquals(elementEmail.getText(), student.getEmail());
        softAssert.assertTrue(elementPhone.getText().equals(student.getMobile()));
        softAssert.assertAll();


    }
    @Test
    public void regFormNegativeTest_lastname_empty(){
        StudentDTO student = new StudentDTO("Frodo", "", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Music",
                "J.Washington street, 10", "NCR", "Delphi");
        hideFooter();
        fillStudentForm(student);
        Assert.assertFalse(isElementPresent_Success());

    }
    @AfterMethod
    public void afterMethod(){
        if(isElementPresent(textSuccses))
            closeForm();
        else {
            wd.navigate().refresh();
            hideFooter();
        }

    }


}
