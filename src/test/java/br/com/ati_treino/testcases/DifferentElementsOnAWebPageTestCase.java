package br.com.ati_treino.testcases;

import br.com.ati_treino.frameworks.utlis.BaseTest;
import br.com.ati_treino.tasks.DifferentElementsTask;
import org.testng.annotations.Test;

public class DifferentElementsOnAWebPageTestCase extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        DifferentElementsTask differentElementsTask = new DifferentElementsTask(driver);
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

        differentElementsTask
                .textArea()
                .textBox()
                .radioCheckBox()
                .checkbox3CheckBox()
                .inputTypeButton()
        //        .dropDownSelect()
                .webTable()
                .wikipediaFrames()
                .datePicker()
                .autoComplete()
        ;
        Thread.sleep(5000);
    }

}
