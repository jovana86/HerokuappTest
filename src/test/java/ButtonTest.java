import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    /**
     * Checking button double click
     * Test steps:
     * 1. Navigate to https://demoqa.com/buttons
     * 2. Double click on element
     * Expected result:
     * 2. Text message is shown
     */
    @Test
    public void doubleClickTest() {
        print ( "1. Navigate to https://demoqa.com/buttons" );
        driver.get ( Strings.BUTTON_URL );
        print ( "2. Double click on element" );
        buttonPage.setDoubleClick ();
        print ( "2. Text message is shown" );
        Assert.assertTrue ( buttonPage.readText ( buttonPage.doneDouble ).contains ( "You have done a double click" ) );
    }

    /**
     * Checking button right click
     * Test steps:
     * 1. Navigate to https://demoqa.com/buttons
     * 2 Right click on the element
     * Expected result:
     * 2. Text message is shown
     */
    @Test
    public void rightClicTest() {
        print ( "1. Navigate to https://demoqa.com/buttons" );
        driver.get ( Strings.BUTTON_URL );
        print ( "2 Right click on the element" );
        buttonPage.setRightClick ();
        print ( "2. Text message is shown" );
        Assert.assertTrue ( buttonPage.readText ( buttonPage.doneRight ).contains ( "You have done a right click" ) );
    }

    /**
     * Checking button right click
     * Test steps:
     * 1. Navigate to https://demoqa.com/buttons
     * 2. Click on the element
     * Expected result:
     * 2. Text message is shown
     */
    @Test
    public void elementClick() {
        print ( "1. Navigate to https://demoqa.com/buttons" );
        driver.get ( Strings.BUTTON_URL );
        print ( "2. Click on the element" );
        buttonPage.setClickMe ();
        print ( "2. Text message is shown" );
        Assert.assertTrue ( buttonPage.readText ( buttonPage.doneClick ).equals ( "You have done a dynamic click" ) );
    }

}
