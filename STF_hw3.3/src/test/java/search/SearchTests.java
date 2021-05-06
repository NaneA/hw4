package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Search;
import pages.SearchResults;
import pages.Home;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SearchTests extends BaseTests {

    @Test
    public void testSuccessfulSearch(){
        Search searchpage = homePage.clickBtn();
        searchpage.search("polo");
        assertEquals(searchpage.getSearchResults(), "RESULTS FOR POLO");
    }




    @Test
    public void testCheckbox(){
        Search searchpage = homePage.clickBtn();
        searchpage.search("polo");
        searchpage.ClickCategories();
        searchpage.ClickCheck();
        assertEquals(searchpage.CheckboxCheck(), "Women");
    }

    @Test
    public void checkSidebar(){
        Search searchpage = homePage.clickBtn();
        searchpage.search("polo");
        assertTrue(searchpage.ContentExists());
    }
}
