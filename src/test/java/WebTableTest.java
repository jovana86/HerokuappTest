import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {
    /**
     * Edit data in table
     * 1. Navigate to https://demoqa.com/webtables
     * 2. Click on edit button of the first user
     * 3. Clear field salary
     * 4. Type new salary
     * 5. Click submit
     * Expected result
     * 5. Value in table is the same as typed value in step 4
     */

    @Test
    public void webTableTest() {
        print ( "1. Navigate to https://demoqa.com/webtables" );
        driver.get ( Strings.WEBTABLES_URL );
        print ( "2. Click on edit button of the first user" );
        webTablePage.click ( webTablePage.firstUser );
        print ( "3. Clear field salary" );
        webTablePage.clearText ( webTablePage.salary );
        print ( "4. Type new salary" );
        webTablePage.writeText ( webTablePage.salary, "7500" );
        print ( "5. Click submit" );
        webTablePage.click ( webTablePage.submit );
        print ( "5. Value in table is the same as typed value in step 4" );
        Assert.assertTrue ( webTablePage.readText ( webTablePage.salaryInTable ).equals ( "7500" ) );

    }
    /**
     * Add new user
     * Test steps:
     * 1. Navigate to https://demoqa.com/webtables
     * 2. Click Add button
     */
    @Test (dataProvider = "validCredentials", dataProviderClass = DataInputs.class)
    public void addNewUserTest(String name,String lName,String mail, String age, String salary,String dep){
        print ( "1. Navigate to https://demoqa.com/webtables" );
        driver.get ( Strings.WEBTABLES_URL );
        print ( "2. Click Add button" );
        webTablePage.click ( webTablePage.add );
        webTablePage.writeText  ( webTablePage.firstName,name );
        webTablePage.writeText ( webTablePage.lastName,lName );
        webTablePage.writeText ( webTablePage.email,mail );
        webTablePage.writeText ( webTablePage.age,age );
        webTablePage.writeText ( webTablePage.salary,salary );
        webTablePage.writeText ( webTablePage.dep,dep );
        webTablePage.click ( webTablePage.submit );
        Assert.assertTrue ( webTablePage.readText ( webTablePage.rowName ).contains ( "Jovana" ) );

    }

}
