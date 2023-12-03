package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssLocators {
    WebDriver wd;
    @BeforeClass
    public void bc(){

        wd = new ChromeDriver();
    }
    @Test
    public void testTextBox(){

        wd.navigate().to("https://demoqa.com/text-box");

        WebElement input = wd.findElement(By.cssSelector("input[id='userName']"));

        System.out.println("-->  "+input.getAttribute("placeholder"));

        WebElement input2 = wd.findElement(By.cssSelector("#permanentAddress-label"));
        WebElement input3 = wd.findElement(By.cssSelector("span[class='rct-text']>label>span[class='rct-text']>svg"));

        System.out.println("-->  "+input2.getText());


    }
    @Test
    public void testCheckBox(){
        wd.navigate().to("https://demoqa.com/checkbox");

        WebElement input = wd.findElement(By.cssSelector("span[class='rct-text']>label>span[class='rct-node-icon']>svg"));

        System.out.println("-->  "+input.getAttribute("fill"));


    }
    @Test
    public void testRadio(){
        wd.navigate().to("https://demoqa.com/radio-button");

        WebElement inputR = wd.findElement(By.cssSelector("[for='yesRadio']"));

        inputR.click();
        WebElement input = wd.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] :nth-child(2) :nth-child(5)"));

        System.out.println("-->  "+input.getText());


    }

    @AfterClass
    public void ac(){
        wd.quit();
    }


}
