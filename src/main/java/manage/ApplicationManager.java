package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationManager {
WebDriver wd;

UserHelper userHelper;

public void init(){
    ChromeOptions  options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    wd = new ChromeDriver(options);
    wd.manage().window().maximize();
    wd.navigate().to("https://trello.com");
    userHelper = new UserHelper(wd);
}

    public UserHelper getUserHelper() {
        return userHelper;
    }
    public void quit(){
    wd.close();
    wd.quit();
    }
}
