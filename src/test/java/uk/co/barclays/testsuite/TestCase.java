package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();

    //TestCases
    @Test (groups = {"Regression","Sanity"})
    public void verifyMouseHoverActionOnBankDropDownLink() {
        //mouseHover on bank dropdown link
        homePage.mouseHoverOnBankDropDownLink();
    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyMouseHoverOnBorrowDropDownLink() {
        //mouseHover on borrow dropdown link
        homePage.mouseHoverOnBorrowDropDownLink();
    }

}
