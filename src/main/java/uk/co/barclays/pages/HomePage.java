package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    //list of elements and their locations
    By bankDropDownLink = By.linkText("Bank");
    By borrowDropDownLink = By.linkText("Borrow");

    //methods performing actions on elements
    public void mouseHoverOnBankDropDownLink() {
        mouseHover(bankDropDownLink);
    }

    public void mouseHoverOnBorrowDropDownLink() {
        mouseHover(borrowDropDownLink);
    }

}
