package Gittigidiyor.step_def;

import Gittigidiyor.utils.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    ChromeOptions chromeOptions = new ChromeOptions();

    @Before
    public void setup() {
        Drivers.get().get("https://www.gittigidiyor.com/");
        Drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Drivers.get().manage().window().maximize();
        chromeOptions.addArguments("--disable-notifications");

    }

    @After
    public void teardown(){
        Drivers.closeDriver();
    }

}
