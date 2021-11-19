package KloiaWeb.step_def;

import KloiaWeb.utils.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    @Before
    public void setup() {
        Drivers.get().get("https://www.bestbuy.com/");
        Drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Drivers.get().manage().window().maximize();

    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Drivers.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Drivers.closeDriver();
    }

}
