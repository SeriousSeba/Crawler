public class CrawlingMachine {


    public static void main(String[] args){
        ShopInfo shopInfo=new ShopInfo("Ceneo","https://www.ceneo.pl",
                "https://www.ceneo.pl/;szukaj-","",
                "div[data-pid]");//
        WebShop webShop=new WebShop(shopInfo);
        ShopCrawler shopCrawler=new ShopCrawler(webShop,"Pan Tadeusz",20);
        shopCrawler.run();

    }

}
