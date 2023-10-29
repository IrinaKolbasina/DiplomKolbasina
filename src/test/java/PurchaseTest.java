import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseTest {
    private static String link;
    private int countBefore;
    private int countAfter;
    private static PageElements elements;
    private static Data.MonthAndYear monthAndYear;
    private static Data.ListCards listCards;

    @BeforeAll
    static void init() {
        SqlUtils.dbConnect();
        link = System.getProperty("url");
        elements = new PageElements();
        monthAndYear = Data.getMonthAndYear();
        listCards = Data.getListCards();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void close() {
        SqlUtils.dbCloseConnect();
        SelenideLogger.removeListener("allure");
    }

    @Test
    @DisplayName("Проверка отображения подтверждения в проведении операции в меню купить в кредит")
    void shouldReturnSuccessNotification_credit() {
        countBefore = SqlUtils.countApprovedCredit();
        open(link);
        elements.creditBuyButtonClick()
                .cardOneInput(listCards)
                .validMonthAndYearInput(monthAndYear)
                .fakerNameAndCvcInput()
                .continueButtonClick()
                .successNotificationVisible();
        countAfter = SqlUtils.countApprovedCredit();
        assertEquals(countBefore + 1, countAfter);
    }
}