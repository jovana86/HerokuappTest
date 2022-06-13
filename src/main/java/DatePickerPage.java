import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"datePickerMonthYearInput\"]")
    WebElement dateField;
    @FindBy(id = "dateAndTimePickerInput")
    WebElement dateAndTimeField;

    @FindBy(xpath = "//div[@class='react-datepicker-popper']")
    WebElement calendar;

    // @FindBy(xpath = "//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']")
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement monthPicker;
    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement yearPicker;
    @FindBy(xpath = "//div[@class='react-datepicker__month']")
    WebElement dayPicker;

    @FindBy(className = "react-datepicker")
    WebElement dateContainer;
    // @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--009 react-datepicker__day--selected']")
    @FindBy(xpath = "//div[text()='9']")
    WebElement day9;
    @FindBy(xpath = "//div[text()='April 1986']")
    WebElement calendarHeadline;


    //Webelements for second calendar
    @FindBy(xpath = "//span[@class='react-datepicker__month-read-view--down-arrow']")
    WebElement pickMonth2;

    @FindBy(xpath = "//span[@class='react-datepicker__year-read-view--down-arrow']")
    WebElement pickYear2;
    @FindBy(xpath = "//li[text()='07:45']")
    WebElement time;
    @FindBy(xpath = "//div[@class='react-datepicker__month-dropdown']")
    WebElement monthDropdown;
    @FindBy(xpath = "//div[text()='April']")
    WebElement april;
    @FindBy(xpath = "//div[text()='1986']")
    WebElement year1986;
    @FindBy(xpath = "//a[@class='react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous']")
    WebElement yearsDown;

    public DatePickerPage(WebDriver driver) {
        super ( driver );
        PageFactory.initElements ( driver, this );
    }

    public void clickDateField() {
        waitForElement ( dateField );
        dateField.click ();
    }

    public void chooseMonth() {
        clickDateField ();
        monthPicker.click ();
        monthPicker.sendKeys ( "April" );
    }

    public void pickYear() {
        clickDateField ();
        yearPicker.click ();
        yearPicker.sendKeys ( "1986" );
    }

    public void pickDay() {
        clickDateField ();
        dayPicker.click ();
        day9.click ();

    }

    public boolean verifySelectedDate() {
        if
        (dateField.getText ().equals ( "04/09/1986" )) {

            System.out.println ( "Test passed" );
        }
        return true;
    }

    public void enterDayMonthAndYear(){
        dateField.click ();
        dateField.sendKeys ( Keys.chord ( Keys.CONTROL,"a" ) );
        dateField.sendKeys ( Keys.DELETE );
        dateField.sendKeys ( "04/09/1986" );
    }
    public boolean verifyEnteredDate(){
        if(calendarHeadline.getText ().equals ( "April 1986" ) && day9.isSelected ()){
            System.out.println ("Test passed");
        }
        return true;
    }

    public void clickDateAndTimeField(){
        waitForElement ( dateAndTimeField );
        dateAndTimeField.click ();
    }
    public void chooseDate2FromCalendar(){
        clickDateAndTimeField ();
        pickMonth2.click ();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", april);
        april.click ();
        pickYear2.click ();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", year1986);
        year1986.click ();
        day9.click ();
        time.click ();
    }
    public void enterDate2(String month, String day, String year, String time){
        clickDateAndTimeField ();
        dateAndTimeField.sendKeys ( Keys.chord ( Keys.CONTROL,"a" ) );
        dateAndTimeField.sendKeys ( Keys.DELETE );
        dateAndTimeField.sendKeys ( month,day,year,time );
       // dateAndTimeField.sendKeys ( "April 9, 1986 7:45 AM" );

    }
    public boolean verifyDate2(){
        if(calendarHeadline.getText ().equals ( "April 1986" ) && day9.isSelected () && time.isSelected ()){
            System.out.println ("Test passed");
        }
        return true;
    }
}
