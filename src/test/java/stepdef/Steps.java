package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Weblocates;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Steps {

    Weblocates weblocates=new Weblocates();
    WebDriver driver= Driver.getDriver();



    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String webSayfasi) {
      driver.get(ConfigReader.getProperty(webSayfasi));
    }

    @Then("amazon sayfasinda oldugunu dogrular")
    public void amazonSayfasindaOldugunuDogrular() {
        ReusableMethods.visibleWait(weblocates.aramaKutusu,5);
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon.com.tr"));

    }
}
