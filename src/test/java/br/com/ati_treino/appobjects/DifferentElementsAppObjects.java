package br.com.ati_treino.appobjects;

import br.com.ati_treino.frameworks.utlis.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DifferentElementsAppObjects {

    private final WebDriver driver;
    private final Wait wait;

    public DifferentElementsAppObjects (WebDriver driver) {
        this.driver = driver;
        wait = new Wait(driver);
    }

    public WebElement textAreaTextField() {
        return driver.findElement(By.cssSelector("textarea[name='message']"));
    }
    public WebElement enviarTextAreaButton() { return driver.findElement(By.cssSelector("#post-body-7988417473080013803 > div:nth-child(1) > center > form:nth-child(5) > input[type=submit]")); }
    public WebElement firstNameTextBoxTextField() {
        return driver.findElement(By.name("firstname"));
    }
    public WebElement lastNameTextBoxTextField() {
        return driver.findElement(By.name("lastname"));
    }
    public WebElement noRadioCheckBox() {
        return driver.findElement(By.cssSelector("input[name='answer'][value='No']"));
    }
    public WebElement otherRadioCheckBox() {
        return driver.findElement(By.cssSelector("input[name='answer'][value=\"Don't Know\"]"));
    }
    public WebElement checkbox3CheckBox() {
        return driver.findElement(By.name("Checkbox3"));
    }
    public WebElement inputTypeButton() {
        return driver.findElement(By.cssSelector("input[value='Click Me!']"));
    }
    public Select listDropDownSelect() {
        return new Select(driver.findElement(By.name("cars")));
    }
    public WebElement enviarDropDownButton() {
        return driver.findElement(By.cssSelector("form:nth-child(52) input[type=submit]"));
    }
    public WebElement nameJohnWebTableTextLabel() {
        wait.waitVisibilityElement(By.cssSelector(" center table tbody tr:nth-child(3) td:nth-child(1)"));
        return driver.findElement(By.cssSelector(" center table tbody tr:nth-child(3) td:nth-child(1)"));
    }
    public WebElement salary7000WebTableTextLabel() {
        return driver.findElement(By.cssSelector(" center table tbody tr:nth-child(3) td:nth-child(2)"));
    }
    public void getInFrames(){
        WebElement elementFrame = driver.findElement(By.id("iframe01"));
        driver.switchTo().frame(elementFrame);
    }
    public void getOutFrames() {
        driver.switchTo().defaultContent();
    }
    public WebElement searchWikipediaFramesFieldText() {
        return driver.findElement(By.id("searchInput"));
    }
    public WebElement pesquisarWikipediaFramesButton() {
        return driver.findElement(By.cssSelector("fieldset button"));
    }
}
