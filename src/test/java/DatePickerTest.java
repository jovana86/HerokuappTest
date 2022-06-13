import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    /**
     * Select day month and year from the calendar
     * Test steps:
     * 1. Navigate to https://demoqa.com/date-picker
     * 2. Choose year
     * 3. Choose month
     * 4. Choose day
     * Expexted result
     * 4. Selected date is shown in date field
     */

    @Test
    public void selectDateMonthAndYearTest() {
        DatePickerPage datePickerPage = new DatePickerPage ( driver );
        print ( "1. Navigate to https://demoqa.com/date-picker" );
        driver.get ( Strings.DATE_PICKER_URL );
        print ( "2. Choose year" );
        datePickerPage.pickYear ();
        print ( "3. Choose month" );
        datePickerPage.chooseMonth ();
        print ( "4. Choose day" );
        datePickerPage.pickDay ();
        print ( "4. Selected date is shown in date field" );
        Assert.assertTrue ( datePickerPage.verifySelectedDate () );
    }

    /**
     * Enter day month and year in date field
     * Test steps:
     * 1. Navigate to https://demoqa.com/date-picker
     * 2. Enter date in date field
     * Expexted result
     * 2. Entered date is shown in calendar
     */


    @Test
    public void enterDateInDateField() {
        DatePickerPage datePickerPage = new DatePickerPage ( driver );
        print ( "1. Navigate to https://demoqa.com/date-picker" );
        driver.get ( Strings.DATE_PICKER_URL );
        print ( "2. Enter date in date field" );
        datePickerPage.enterDayMonthAndYear ();
        print ( "2. Entered date is shown in calendar" );
        Assert.assertTrue ( datePickerPage.verifyEnteredDate () );
    }


    /**
     * Enter day month year and time in date field
     * Test steps:
     * 1. Navigate to https://demoqa.com/date-picker
     * 2. Enter date and time in date field
     * Expexted result
     * 2. Entered date and time is shown in calendar
     */
    @Test(dataProvider = "dateInputs", dataProviderClass = DataInputs.class)
    public void enterDate2(String m,String y,String d,String t) {
        DatePickerPage datePickerPage = new DatePickerPage ( driver );
        print ( "1. Navigate to https://demoqa.com/date-picker" );
        driver.get ( Strings.DATE_PICKER_URL );
        print ( "2. Enter date and time in date field" );
        datePickerPage.enterDate2 (m,y,d,t);
        print ( "2. Entered date and time is shown in calendar" );
        Assert.assertTrue ( datePickerPage.verifyDate2 () );
    }
}




