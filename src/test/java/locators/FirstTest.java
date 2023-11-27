package locators;

import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;
    @Test
    public void firstStartTrello(){
        wd = new ChromeDriver();
        wd.get("https://demoqa.com/");

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        wd.quit();



    }


}
