package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class SelectedExpertDeckPage extends BasePage {

    public static final String SELECTED_EXPERT_DECK_PAGE = "SelectedExpertDeckPage";
    public static final String EXPERT_DECK_TITLE = "expert_deck_title";
    public static final String PRACTICE_BUTTON = "practice_button";
    public static final String PRACTICE_BUTTON_LABEL = "Practice";
    public static final String VIEW_EDIT_CARDS_BUTTON = "view_edit_cards_button";
    public static final String VIEW_EDIT_CARDS_BUTTON_LABEL = "View/Edit Cards";
    public static final String BACK_BUTTON = "back_button";

    public SelectedExpertDeckPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void isPracticeButtonVisible() throws IOException {
        isElementNameEqualTo(SELECTED_EXPERT_DECK_PAGE, PRACTICE_BUTTON, PRACTICE_BUTTON_LABEL);
    }

    public void isViewCardsButtonVisible() throws IOException {
        isElementNameEqualTo(SELECTED_EXPERT_DECK_PAGE, VIEW_EDIT_CARDS_BUTTON, VIEW_EDIT_CARDS_BUTTON_LABEL);
    }

    public void verifyDeckTitle(String expectedDeckTitle) throws IOException {
        isElementNameEqualTo(SELECTED_EXPERT_DECK_PAGE, EXPERT_DECK_TITLE, expectedDeckTitle);
    }

    public void navigateToCardsList() throws IOException {
        tapElement(SELECTED_EXPERT_DECK_PAGE, VIEW_EDIT_CARDS_BUTTON);
    }

    public void navigateBackFromSelectedExpertDeckPage() throws IOException {
        tapElement(SELECTED_EXPERT_DECK_PAGE, BACK_BUTTON);
    }

    public void navigateToPractice() throws IOException {
        tapElement(SELECTED_EXPERT_DECK_PAGE, PRACTICE_BUTTON);
    }


}
