package br.com.ati_treino.frameworks.utlis;

import br.com.ati_treino.frameworks.webdrivers.Browser;
import br.com.ati_treino.frameworks.webdrivers.DriverFactory;
import br.com.ati_treino.frameworks.webdrivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends DriverFactory {

    @BeforeMethod
    public void setUp() {
        driver = getBrowser(Browser.CHROME);
        DriverManager.setDriver(driver);
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quit();
    }

}
