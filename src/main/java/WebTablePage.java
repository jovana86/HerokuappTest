import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.List;

public class WebTablePage extends BasePage {

//    @FindBy(id ="salary" )
//    WebElement salary;
//
//
//    @FindBy(xpath = "//span[@id='edit-record-1']")
//            WebElement firstUser;
//
//    @FindBy(id = "submit")
//    WebElement submit;
//
//    @FindBy(xpath = "//div[text()='7500']")
//    WebElement salaryInTable;

    By salary = By.id ( "salary" );
    By firstUser = By.xpath ( "//span[@id='edit-record-1']" );
    By submit = By.id ( "submit" );

    By salaryInTable = By.xpath ( "//div[text()='7500']" );
    //By table = By.className ( "rt-tr -odd" );
   // By name = By.className ( "rt-resizable-header-content" );
    By add = By.id ( "addNewRecordButton" );
    By firstName = By.id ( "firstName" );
    By lastName = By.id ( "lastName" );
    By email = By.id ( "userEmail" );
    By age = By.id ( "age" );
    By dep = By.id ( "department" );
    By rowName = By.xpath ( "//div[text()='Jovana']" );


    public WebTablePage(WebDriver driver) {
        super ( driver );
        PageFactory.initElements ( driver, this );
    }




//    public void tableOfUsers(){
//        waitVisibility ( table );
//        ArrayList<String> elements = new ArrayList<> ();
//        List<WebElement> elements = driver.findElements ( table );
//        for (WebElement e:elements){
//            String name = e.findElement ( By.xpath ( "//div[text()='First Name']" ) ).getText ();
//            elements.add ( name );
//            String salary = e.findElement ( By.xpath ( "//div[text()='Salary']" ) );
//            elements.add ( salary );
//        }
//
//    }





}

