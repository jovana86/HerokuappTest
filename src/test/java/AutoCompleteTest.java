import org.testng.Assert;
import org.testng.annotations.Test;


public class AutoCompleteTest extends BaseTest {
    /**
     * Select multiple colors test
     * Test steps:
     * 1. Navigate to https://demoqa.com/auto-complete
     * 2. Select multiple colors by typing whole name color or just first letters
     * Expected result:
     * 2. Verify chosen colors are shown in the text box
     */

    @Test
    public void selectMultipleColors() {
        AutoCompletePage autoCompletePage = new AutoCompletePage ( driver );
        print ( "1. Navigate to https://demoqa.com/auto-complete" );
        driver.get ( Strings.AUTO_COMPLETE_URL );
        print ( "2. Select multiple colors by typing whole name color or just first letters" );
        autoCompletePage.selectMultipleColors ();
        print ( "2. Verify chosen colors are shown in the text box" );
        Assert.assertTrue ( autoCompletePage.verifySelectedColors () );

    }

    /**
     * Select one color test
     * Test steps:
     * 1. Navigate to https://demoqa.com/auto-complete
     * 2. Select one color by typing just first letter
     * Expected result:
     * 2. Verify chosen color is shown in the text box
     */
    @Test
    public void selectOneColorTest() {
        AutoCompletePage autoCompletePage = new AutoCompletePage ( driver );
        print ( "1. Navigate to https://demoqa.com/auto-complete" );
        driver.get ( Strings.AUTO_COMPLETE_URL );
        print ( "2. Select one color by typing just first letter" );
        autoCompletePage.selectOneColor ();
        print ( "2. Verify chosen colors are shown in the text box" );
        Assert.assertTrue ( autoCompletePage.verifySelectedColor () );
    }
}
