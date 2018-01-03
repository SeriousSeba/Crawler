import product.ProductInfo;
import website.PageInfo;
import website.WebShop;

import java.util.LinkedList;
import java.util.List;


public class ShopCrawler {

    private WebShop webShop;
    private String product;
    private int limit;
    private List<ProductInfo> list=new LinkedList<ProductInfo>();

    public ShopCrawler(WebShop webShop,String product,int limit){

        this.webShop=webShop;
        this.product=product;
        this.limit=limit;
    }




    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                ProductInfo[] productInfos = webShop.getProducts(product,limit);
                for(ProductInfo productInfo:productInfos) {
                    LinkedList<String> list = webShop.getShopsList(productInfo);
                    productInfo.getInfo();
                }
            }
        }
        ).start();
    }




}


