package KloiaWeb.step_def;

import KloiaWeb.utils.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    @Before
    public void setup() {
        Drivers.get().get("https://www.gittigidiyor.com/");
        Drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Drivers.get().manage().window().maximize();

    }

    @After
    public void teardown(){
        Drivers.closeDriver();
    }

}
