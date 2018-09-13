package buy;
import howtobuyflow.*;


public class BuyWatchTest {
    public void checkflowhowtobuy(){
        GoToGoogle navtogoole = new GoToGoogle();
        navtogoole.opengooglebrowser();
        SearchTheWatchShop watchshop = new SearchTheWatchShop();
        watchshop.search = "ceas";
        watchshop.dosearch();
        SelectTheShope clickonshoplink = new SelectTheShope();
        clickonshoplink.clicktheshoplink();
        SearchTheWatch searchwatch = new SearchTheWatch();
        searchwatch.searchbox = "fitness";
        searchwatch.dothesearchwatch();
        SelectTheWatch watchfiness = new SelectTheWatch();
        watchfiness.selectfitnesswatch();
        ViewThePrice pricewatch = new ViewThePrice();
        int price = pricewatch.takepricevalue();









    }
}
