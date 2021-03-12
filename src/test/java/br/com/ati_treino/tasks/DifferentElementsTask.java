package br.com.ati_treino.tasks;

import br.com.ati_treino.appobjects.DifferentElementsAppObjects;
import org.openqa.selenium.WebDriver;

public class DifferentElementsTask {

    private final WebDriver driver;
    private final DifferentElementsAppObjects differentElementsAppObjects;

    public DifferentElementsTask (WebDriver driver) {
        this.driver = driver;
        differentElementsAppObjects = new DifferentElementsAppObjects(driver);
    }

    public DifferentElementsTask textArea() {
        differentElementsAppObjects.textAreaTextField().clear();
        differentElementsAppObjects.textAreaTextField().sendKeys("TESTE");
//        differentElementsAppObjects.enviarTextAreaButton().click();
        return this;
    }
    public DifferentElementsTask textBox() {
        differentElementsAppObjects.firstNameTextBoxTextField().sendKeys("Jeferson");
        differentElementsAppObjects.lastNameTextBoxTextField().sendKeys("Lopes Eugenio");
        return this;
    }
    public DifferentElementsTask radioCheckBox() {
//        differentElementsAppObjects.noRadioCheckBox().click();
        differentElementsAppObjects.otherRadioCheckBox().click();
        return this;
    }
    public DifferentElementsTask checkbox3CheckBox() {
        differentElementsAppObjects.checkbox3CheckBox().click();
        return this;
    }
    public DifferentElementsTask inputTypeButton() {
        differentElementsAppObjects.inputTypeButton().click();
        driver.switchTo().alert().accept();
        return this;
    }
    public DifferentElementsTask dropDownSelect() {
        differentElementsAppObjects.listDropDownSelect().selectByValue("fiat");
        differentElementsAppObjects.enviarDropDownButton().click();
        driver.close();
        return this;
    }
    public DifferentElementsTask webTable() {
        System.out.println("Nome: " + differentElementsAppObjects.nameJohnWebTableTextLabel().getText());
        System.out.println("Salario: " + differentElementsAppObjects.salary7000WebTableTextLabel().getText());
        return this;
    }
    public DifferentElementsTask wikipediaFrames() {
        differentElementsAppObjects.getInFrames();
        differentElementsAppObjects.searchWikipediaFramesFieldText().sendKeys("Teste");
        differentElementsAppObjects.pesquisarWikipediaFramesButton().click();
//        differentElementsAppObjects.getOutFrames();
        return this;
    }
}
