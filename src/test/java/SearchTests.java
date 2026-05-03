import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

public class SearchTests extends TestBase {

    SearchPage searchPage = new SearchPage();

    @Test
    @Tag("MOBILE")
    @Description("При вводе поисковой строки есть результаты")
    void successfulSearchTest() {
        searchPage.skipStartScreen()
                .clickSearchArea()
                .enterSearchQuery()
                .verifyResultListIsNotEmpty();
    }

    @Test
    @Tag("MOBILE")
    @Description("Можно выбрать результат поиска")
    void successfulSearchResultSelectTest() {
        searchPage.skipStartScreen()
                .clickSearchArea()
                .enterSearchQuery()
                .verifyResultListIsNotEmpty()
                .clickSearchResult()
                .clickCloseButton()
                .verifySearchResultTitle();
    }

    @Test
    @Tag("MOBILE")
    @Description("Можно вернуться в результаты поиска")
    void successfulSearchResultBackTest() {
        searchPage.skipStartScreen()
                .clickSearchArea()
                .enterSearchQuery()
                .verifyResultListIsNotEmpty()
                .clickSearchResult()
                .clickCloseButton()
                .clickBackButton()
                .verifyResultListIsNotEmpty();
    }

    @Test
    @Tag("MOBILE")
    @Description("Можно очистить результаты поиска")
    void successfulSearchEntryEraseTest() {
        searchPage.skipStartScreen()
                .clickSearchArea()
                .enterSearchQuery()
                .clickClearSearchButton()
                .verifySearchFieldIsEmpty();
    }

    @Test
    @Tag("MOBILE")
    @Description("После очистки есть список недавних запросов")
    void successfulRecentSearchResultsTest() {
        searchPage.skipStartScreen()
                .clickSearchArea()
                .enterSearchQuery()
                .clickClearSearchButton()
                .verifyRecentSearchTitle()
                .verifyRecentSearchElement();
    }
}