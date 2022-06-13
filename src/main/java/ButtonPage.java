import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage extends BasePage {
    Actions act = new Actions ( driver );
    By doubleClick = By.xpath ( "//button[@id='doubleClickBtn']" );
    By rightClick = By.id ( "rightClickBtn" );
    By clickMe = By.xpath ( "//button[text()='Click Me']" );
    By doneDouble = By.id ( "doubleClickMessage" );
    By doneRight = By.id ( "rightClickMessage" );
    By doneClick = By.id ( "dynamicClickMessage" );

    public ButtonPage(WebDriver driver) {
        super ( driver );
       // PageFactory.initElements ( driver, this );
    }

    public void setDoubleClick() {
        waitForElement ( driver.findElement ( doubleClick ) );
        act.doubleClick ( driver.findElement ( doubleClick ) ).perform ();
    }

    public void setRightClick() {
        act.contextClick ( driver.findElement ( rightClick ) ).perform ();
    }

    public void setClickMe() {
        ((JavascriptExecutor) driver).executeScript ( "arguments[0].scrollIntoView(true);", driver.findElement ( clickMe ) );
        act.click ( driver.findElement ( clickMe ) ).perform ();
    }

}
