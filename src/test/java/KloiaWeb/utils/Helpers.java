package KloiaWeb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class Helpers {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchLastTab() {

        String originTab=Drivers.get().getWindowHandle();
        Set<String> allTabs = Drivers.get().getWindowHandles();
        for (String tab : allTabs) {
            if(!originTab.equals(tab))
                Drivers.get().switchTo().window(tab);
        }

    }

    public static void clickIntercepted(String arg0) {
        WebElement element = Drivers.get().findElement(By.xpath(arg0));
        JavascriptExecutor executor = (JavascriptExecutor)Drivers.get();
        executor.executeScript("arguments[0].click();", element);
    }
}
