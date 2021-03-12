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
        return this;
    }
    public DifferentElementsTask textBox() {
        differentElementsAppObjects.firstNameTextBoxTextField().sendKeys("Jeferson");
        differentElementsAppObjects.lastNameTextBoxTextField().sendKeys("Lopes Eugenio");
        return this;
    }
}
