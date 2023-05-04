package manage;

import org.openqa.selenium.WebDriver;

public class BaseHelper {
   WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }
}
