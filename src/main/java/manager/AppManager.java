package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface AppManager {
    ChromeOptions options = new ChromeOptions().addArguments("load-extension=/Users/anna/Tools/5.10.1_0");
    WebDriver wd = new ChromeDriver(options);
    default void init(){
        wd.navigate().to("https://demoqa.com/");
    }
    default void initAddOptions(){
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        for(String el: tabs){
            System.out.println("-->"+ el);
        }
        wd.switchTo().window(tabs.get(1)).close();
        wd.switchTo().window(tabs.get(0));
        wd.navigate().refresh();

    }
    default void stop(){
        wd.quit();
    }

}
