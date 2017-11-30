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

    public void getInfo(){
        for(ProductInfo productInfo:productInfos) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nazwa: " + productInfo.getProductName() + "\n");
            stringBuilder.append("Id: " + productInfo.getProductId() + "\n");
            stringBuilder.append("Kategoria: " + productInfo.getProdcutCategory() + "\n");
            stringBuilder.append("Ocena: " + productInfo.getProductScore() + "\n");
            stringBuilder.append("URL: " + productInfo.getProductUrl() + "\n");
            stringBuilder.append("ImageURL: " + productInfo.getproductImageUrl() + "\n");
            stringBuilder.append("Najnizsza cena: " + productInfo.getProductBottom() + "\n\n\n");
            System.out.println(stringBuilder.toString());
        }
    }

}
