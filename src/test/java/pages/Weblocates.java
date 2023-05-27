package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Weblocates {

    public Weblocates() {
        PageFactory.initElements(Driver.getDriver(),this);  }


    @FindBy (xpath = "//input[@id=\"twotabsearchtextbox\"]")
    public WebElement aramaKutusu;

}
