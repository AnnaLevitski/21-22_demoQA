package tests;

import manager.HelperStudent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase implements HelperStudent {
    @Test
    public void regFormPositiveTest(){
        WebElement el = wd.findElement(By.xpath("#outbrain_widget_0"));

    }

}
