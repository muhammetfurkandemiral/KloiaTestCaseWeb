package KloiaWeb.utils;

import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Helpers {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Properties fileReader(File arg0) {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(arg0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;

    }

    public static void switchLastTab() {

        String originTab=Drivers.get().getWindowHandle();
        Set<String> allTabs = Drivers.get().getWindowHandles();
        for (String tab : allTabs) {
            if(!originTab.equals(tab))
                Drivers.get().switchTo().window(tab);
        }

    }

    public static void openNewTab(String arg0) {
        WebDriver newTab = Drivers.get().switchTo().newWindow(WindowType.TAB);
        newTab.get(arg0);
    }

    public static void menuLocator(String arg0) {
        String MenuLocator= "//button[text()='" + arg0 + "']";
        Drivers.get().findElement(By.xpath(MenuLocator)).click();
    }

    public static void partialLink(String arg0) {
        Drivers.get().findElement(By.partialLinkText(arg0)).click();
    }

    public static void clickIntercepted(String arg0) {
        WebElement element = Drivers.get().findElement(By.xpath(arg0));
        JavascriptExecutor executor = (JavascriptExecutor)Drivers.get();
        executor.executeScript("arguments[0].click();", element);
    }

    public static String productList(By selector, int index) {
        List<WebElement> myElements = Drivers.get().findElements(selector);
        WebElement product = myElements.get(index);
        String[] a= product.getText().split("\\r?\\n");
        return a[0];
    }
}
