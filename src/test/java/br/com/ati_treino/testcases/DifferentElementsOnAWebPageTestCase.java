package br.com.ati_treino.testcases;

import br.com.ati_treino.frameworks.utlis.BaseTest;
import br.com.ati_treino.tasks.DifferentElementsTask;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DifferentElementsOnAWebPageTestCase extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        DifferentElementsTask differentElementsTask = new DifferentElementsTask(driver);
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

        differentElementsTask
                .textArea()
                .textBox();
        Thread.sleep(5000);
    }

}
