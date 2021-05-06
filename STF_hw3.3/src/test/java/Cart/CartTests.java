package Cart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Cart;

import static org.testng.AssertJUnit.assertEquals;

public class CartTests extends BaseTests {
    @Test
    public void checkCartStatus(){
        Cart status = homePage.clickCart();
        assertEquals(status.getText(), "YOUR SHOPPING BAG IS EMPTY.");
    }

    @Test
    public void checkContShop(){
        Cart status = homePage.clickCart();
        status.clickGoShop();
        assertEquals(status.getUrl(), "https://usa.tommy.com/en");
    }
}
