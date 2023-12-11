package manager;

import org.openqa.selenium.By;

public interface HalperBase extends AppManager{
    default void clikBase(By locator){
        wd.findElement(locator).click();
    }
}

