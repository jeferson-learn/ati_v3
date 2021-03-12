package br.com.ati_treino.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DifferentElementsAppObjects {

    private final WebDriver driver;

    public DifferentElementsAppObjects (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement textAreaTextField() {
        return driver.findElement(By.cssSelector("textarea[name='message']"));
    }
    public WebElement firstNameTextBoxTextField() {
        return driver.findElement(By.name("firstname"));
    }
    public WebElement lastNameTextBoxTextField() {
        return driver.findElement(By.name("lastname"));
    }

}
