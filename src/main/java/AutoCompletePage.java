import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCompletePage extends BasePage {

    @FindBy(id = "autoCompleteMultipleInput")
    WebElement multipleColorField;

    //@FindBy(id = "autoCompleteSingleContainer")
    @FindBy(xpath = "//div[@id='autoCompleteSingleContainer']")
    WebElement singleColorField;
    @FindBy(xpath = "//div[text()='Green']")
    WebElement greenSlected;
    @FindBy(xpath = "//div[text()='Red']")
    WebElement redSelected;
    @FindBy(xpath = "//div[text()='Red']")
    WebElement blackSelected;

    @FindBy(xpath = "//div[text()='Blue']")
    WebElement oneColorSelected;

    public AutoCompletePage(WebDriver driver) {
        super ( driver );
        PageFactory.initElements ( driver, this );
    }

    public void selectMultipleColors() {
        waitForElement ( multipleColorField );
        multipleColorField.sendKeys ( "green" );
        multipleColorField.sendKeys ( Keys.ENTER );
        waitForElement ( greenSlected );
        multipleColorField.click ();

        multipleColorField.sendKeys ( "re" );
        multipleColorField.sendKeys ( Keys.ENTER );

        multipleColorField.sendKeys ( "b" );
        multipleColorField.sendKeys ( Keys.ARROW_DOWN );
        multipleColorField.sendKeys ( Keys.ENTER );
    }

    public boolean verifySelectedColors() {
        assert isElementPresent ( greenSlected ) : "Error. Color is not selected.";
        assert isElementPresent ( redSelected ) : "Error. Color is not selected.";
        assert isElementPresent ( blackSelected ) : "Error. Color is not selected.";
        return true;
    }

    public void selectOneColor() {
        waitForElement ( singleColorField );
        singleColorField.click ();
        singleColorField.sendKeys ( "b" );
        singleColorField.sendKeys ( Keys.ENTER );
    }

    public boolean verifySelectedColor() {
        waitForElement ( singleColorField );
        assert isElementPresent ( oneColorSelected ) : "Error. Color is not selected.";
        return true;
    }

}
