package br.com.ati_treino.testcases;

import br.com.ati_treino.frameworks.utlis.BaseTest;
import br.com.ati_treino.tasks.DifferentElementsTask;
import org.testng.annotations.Test;

import java.io.IOException;

public class DifferentElementsOnAWebPageTestCase extends BaseTest {

    @Test
    public void test() throws InterruptedException, IOException {
        DifferentElementsTask differentElementsTask = new DifferentElementsTask(driver);
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        differentElementsTask
                .textArea()
                .textBox()
                .radioCheckBox()
                .checkbox3CheckBox()
                .inputTypeButton()
                .imagemExist()
                .dropDownSelect() // Fecha aba
                .webTable()
                .wikipediaFrames()
                .datePicker()
                .autoComplete()
                .listBox()
                .comboBox()
                .doubleClickAndRightClick()
                .fileUpload()
                .tiposAlerts() /* parte prompt nao funciona preender */
                .newBrowserWindow() // abrir outra janela navegador
                .testSeleniumWaits5Seconds()
                .hiddenField()
                .sameElement()
        ;
        Thread.sleep(5000);
    }

}
