package website;

import product.ProductInfo;

public class PageInfo {
    private ProductInfo[] productInfos;
    private String nextSiteURL;

    public ProductInfo[] getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(ProductInfo[] productInfos) {
        this.productInfos = productInfos;
    }

    public String getNextSiteURL() {
        return nextSiteURL;
    }

    public void setNextSiteURL(String nextSiteURL) {
        this.nextSiteURL = nextSiteURL;
    }

}
