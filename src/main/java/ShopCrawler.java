import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class ShopCrawler {

    private WebShop webShop;
    private String product;
    private int limit;

    public ShopCrawler(WebShop webShop,String product,int limit){

        this.webShop=webShop;
        this.product=product;
        this.limit=limit;
    }
    private List<ProductInfo> list=new LinkedList();



    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                PageInfo[] pageInfos = webShop.getPages(product,limit);
                for(PageInfo pageInfo:pageInfos) {
                    pageInfo.getInfo();
                }
            }
        }
        ).start();
    }



}


/*
v> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="37622342" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/37622342#mh=S8O7uLJq29000hQMsZ-rAo5odCEzojrtGQSEkyhOQpTqyY5f9x-tRSQPKKWI3fkKwTuizBCDOBD1r0eF78u9HTb3ROpX92h0W8JwiJIMs23m9XriKZzPI_lMVpzZR8ec8C-QpxyINAA8Pd4gVdf8gjmgjqesoWqO9jpQ6GI6NmicJWopTE8S18nI51fi0wwIUDg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/37622342/p-pan-tadeusz-czyli-ostatni-zajazd-na-litwie.jpg" data-preloader alt="Pan Tadeusz czyli ostatni zajazd na Litwie ">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/418/product_type_cat_image.svg" alt="Poezja"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz czyli ostatni zajazd na Litwie
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 100%;"> 5,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 13 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">26</span><span class="price-fraction">,84</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="24287" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/24287#mh=G8R8tWwc89000WVpSJrErhzYKfxI-hFVVN7FDUEwAI7sAy0Y_vj_htQ_6FYnkBenjYkgMso5FRixZwqeZ15fj9dVowRplPgwlqsUjIR3GhpxniBI8dq4aeQjM96rse2bzaQkJ4RztUPyNufcQ2OPISamM4Cutay05MtJNlvmWTj8fCa0NYqzShwVJnq4bPfxoLA2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/24287/p-pan-tadeusz.jpg" data-preloader alt="Pan Tadeusz">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/403/product_type_cat_image.svg" alt="Literatura dla dzieci i młodzieży"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 82.800%;"> 4,14 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(62)</span> </span>
   <div class="listing-shops-number">
     w 11 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">7</span><span class="price-fraction">,53</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="34251264" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/34251264#mh=P9P8C4tE07000GKv8EfrUMdzZ5RyaVxdpViEkyhOQpTqyLocmaeXQyjnVhPqXOWVjzO-UwRtSuBS-6o7m-SSi5ywH_KCsFPJM47FazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/34251264/p-pan-tadeusz.jpg" data-preloader alt="Pan Tadeusz">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/418/product_type_cat_image.svg" alt="Poezja"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> </span>
   <div class="listing-shops-number">
     w 3 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">24</span><span class="price-fraction">,41</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="20982641" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/20982641#mh=H7Q3mLuU25000stjCve5unaDYzdYZtgwvWiEkyhOQpTqy9Z1ORvtzge7bhQggjoiYc1VvxLBtH46K9fnIMGjeM9YyEwrxsTcso3HCWEwAk-tE8WJqKoceI1cTvJgqvRmVlofAgrKgkLv_hEukVg6jS_YsR3z9hZJdLPw6hfl0AmMywJaraCYV0yx5yFyU6HEnbA2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/20982641/p-pan-tadeusz-audiobook.jpg" data-preloader alt="Pan Tadeusz (Audiobook)">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/3453/product_type_cat_image.svg" alt="Audiobooki"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz (Audiobook)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 80.0%;"> 4,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 1 sklepie
   </div>
   <span class="box-list-price"> <span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">9</span><span class="price-fraction">,27</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="109070" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/109070#mh=f7S9NgNc55000takxg2BtRcaR6UcSbmD1ZYh6jaZbKM_WiwxZk5ySRvWf6zOw2mHo7PEe2t-nzUj4YbmvUWufcjMQa0oGzZK7HJwiJIMs23m9XriKZzPI_lMVpzZR8ec8C-QpxyINAA8Pd4gVdf8gjmgjqesoWqO9jpQ6GI6NmicJWopTE8S18nI51fi0wwIUDg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/109070/p-pan-tadeusz.jpg" data-preloader alt="Pan Tadeusz">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/425/product_type_cat_image.svg" alt="Powieści i opowiadania"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 55.00%;"> 2,75 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(4)</span> </span>
   <div class="listing-shops-number">
     w 1 sklepie
   </div>
   <span class="box-list-price"> <span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">29</span><span class="price-fraction">,85</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="16830484" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/16830484#mh=J1r8HlXN68000L403uqGqudVRi7g0hr2YJiEkyhOQpTqyqWqzFEF4ayZ8H-o3b7EJlcPc4pPu-r7LbSiBLJh4YseILJKqaXJBlpTbnCq6f-ppmdalCCkHbzSLXhAIuV9SLuE2IoUGlHAtj_uuH_-LPahstKtljCqqnghUFZhc6dAZhCGbeEZ8hsC3vWdkSE6cZA2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/16830484/p-pan-tadeusz-po-kaszubsku.jpg" data-preloader alt="Pan Tadeusz po kaszubsku">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/425/product_type_cat_image.svg" alt="Powieści i opowiadania"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz po kaszubsku
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> </span>
   <div class="listing-shops-number">
     w 4 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">21</span><span class="price-fraction">,26</span></span> zł</span><del class="old-price grey-text text-darken-1">27,33 zł</del><span class="price-discount_label">-22<span class="percent">%</span></span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="32693827" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/32693827#mh=v1w9jz9b32000laX0n7UjXmDput2oOSNuASEkyhOQpTqy5gsfiiQupTA6L54Om_lYvUiyMlVaNvHhufbYlSj8q_XBdymtPbMKQ7FazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/32693827/p-pan-tadeusz-e-book.jpg" data-preloader alt="Pan Tadeusz  (E-book)">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/3445/product_type_cat_image.svg" alt="E-Beletrystyka"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz (E-book)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 80.0%;"> 4,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 8 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">19</span><span class="price-fraction">,92</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="42078681" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/42078681#mh=W6t6EjXZ63000fdjLf5pvFeZmIhgdH9uHaiEkyhOQpTqyh6o2ueBIQiabCY3RghCk2PeKTUx8ZJS-cAS_OzeHUDagWwJHMU_BpLFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/42078681/p-pan-tadeusz-adam-mickiewicz-audiobook.jpg" data-preloader alt="Pan Tadeusz - Adam Mickiewicz (Audiobook)">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/3453/product_type_cat_image.svg" alt="Audiobooki"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz - Adam Mickiewicz (Audiobook)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> </span>
   <div class="listing-shops-number">
     w 3 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">8</span><span class="price-fraction">,10</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="16754609" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/16754609#mh=P7C7vOqb09000BgwcK0RZxXgZWyDMbZsChyEkyhOQpTqyKO6c0h_dLWbpzEKNWmLHk1NX2zxXQfm6DIR8egqZirAeDts4uk4l3pwiJIMs23m9XriKZzPI_lMVpzZR8ec8C-QpxyINAA8Pd4gVdf8gjmgjqesoWqO9jpQ6GI6NmicJWopTE8S18nI51fi0wwIUDg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/16754609/p-pan-tadeusz-adam-mickiewicz-audiobook.jpg" data-preloader alt="Pan Tadeusz - Adam Mickiewicz (Audiobook)">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/3453/product_type_cat_image.svg" alt="Audiobooki"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz - Adam Mickiewicz (Audiobook)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> </span>
   <div class="listing-shops-number">
     w 3 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">18</span><span class="price-fraction">,91</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="9696221" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/9696221#mh=l5G98y1y71000HIVxJ0CRa79zYKRVc5akWCV6PUnMGe7PY93-Lr_6xZ_Bf3TeOaM_R1pK59B9gkqw7K-YFY9AddQEqLRZukY9bP0ddbnYXEbkIzN9elujupKujux5bH6PVrGiy44PeU1Q_7_Mv-g4T71rcHSK5ET14nQLOvjDQTg-6NaWxbbqL3lHjFwXKKkiHg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/9696221/p-pan-tadeusz-adam-mickiewicz-audiobook-cd.jpg" data-preloader alt="Pan Tadeusz - Adam Mickiewicz [AUDIOBOOK] [CD]">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/3453/product_type_cat_image.svg" alt="Audiobooki"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz - Adam Mickiewicz [AUDIOBOOK] [CD]
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> </span>
   <div class="listing-shops-number">
     w 6 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">39</span><span class="price-fraction">,29</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="51797916" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/51797916#mh=y2y3v3vk25000pAp02Xv1jhTnm4e0biEfaSEkyhOQpTqyX6vfTCzzOMasz5UN4zxDdVpAHe7Nbm8f9fnIMGjeM9bv7N7vI7dE-bFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/51797916/p-pan-tadeusz-adam-mickiewcz.jpg" data-preloader alt="Pan Tadeusz - Adam Mickiewcz">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/425/product_type_cat_image.svg" alt="Powieści i opowiadania"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz - Adam Mickiewcz
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 95.00%;"> 4,75 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(2)</span> </span>
   <div class="listing-shops-number">
     w 37 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">19</span><span class="price-fraction">,44</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="1326027" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/1326027#mh=P7t0Oikg26000qdpRPXc503QAS0fNIS1JGyV6PUnMGe7P5MkmlDprvUX9ovwidpRBfp4H1qQozlsBCzwk8D5bmIS7ywH3oWqsUsUjIR3GhpxniBI8dq4aeQjM96rse2bzaQkJ4RztUPyNufcQ2OPISamM4Cutay05MtJNlvmWTj8fCa0NYqzShwVJnq4bPfxoLA2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/1326027/p-pan-tadeusz-z-opracowaniem-i-streszczeniem-twarda-oprawa.jpg" data-preloader alt="Pan Tadeusz z opracowaniem i streszczeniem (twarda oprawa)">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/403/product_type_cat_image.svg" alt="Literatura dla dzieci i młodzieży"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pan Tadeusz z opracowaniem i streszczeniem (twarda oprawa)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 91.600%;"> 4,58 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(4)</span> </span>
   <div class="listing-shops-number">
     w 21 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">9</span><span class="price-fraction">,20</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="50376038" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/50376038#mh=r9w3VUBP04000SdIi-TF5gsHyQ-PpfyW9FCEkyhOQpTqyRIu_A9vmUL52ekxDUrJZoaHgyYBhfJVnfKyQ-WblqUJ8EdEYV1Xiw_0ddbnYXEbkIzN9elujupKujux5bH6PVrGiy44PeU1Q_7_Mv-g4T71rcHSK5ET14nQLOvjDQTg-6NaWxbbqL3lHjFwXKKkiHg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/50376038/p-streszczenia-pan-tadeusz-literat.jpg" data-preloader alt="Streszczenia - Pan Tadeusz LITERAT">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/412/product_type_cat_image.svg" alt="Podręczniki szkolne"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Streszczenia - Pan Tadeusz LITERAT
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 80.0%;"> 4,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 23 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">3</span><span class="price-fraction">,01</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="39883025" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/39883025#mh=r9g9qGJi59000oUHuM3G7GkhLOhzcLQbpQCEkyhOQpTqyDa0ai_L0jSfchyyMJsrQK1Hd6T9_EeGMcAS_OzeHUDZzmMcgiwQ3xLFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/39883025/p-ogniem-i-mieczem-potop-pan-wolodyjowski-dvd.jpg" data-preloader alt="Ogniem i mieczem + Potop + Pan Wołodyjowski (DVD)">
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Ogniem i mieczem + Potop + Pan Wołodyjowski (DVD)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 100%;"> 5,00 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(1)</span> </span>
   <div class="listing-shops-number">
     w 2 sklepach
   </div>
   <span class="box-list-price"> <span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">47</span><span class="price-fraction">,97</span></span> zł</span><del class="old-price grey-text text-darken-1">89,99 zł</del><span class="price-discount_label">-47<span class="percent">%</span></span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="40580135" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/40580135#mh=n1n2tPao19000SjZfgvme-qtyaUVON6rmdCEkyhOQpTqyTmsxWGpAtrSDoKGO8GJfi_y3t-gIbFmaXHAVT-LLersGLSDPKxhJerFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/40580135/p-wiejskie-gryzmolki-pana-pierdziolki.jpg" data-preloader alt="Wiejskie gryzmołki Pana Pierdziołki">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/454/product_type_cat_image.svg" alt="Pozostałe książki"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Wiejskie gryzmołki Pana Pierdziołki
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 94.00%;"> 4,70 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(5)</span> </span>
   <div class="listing-shops-number">
     w 41 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">11</span><span class="price-fraction">,40</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="24772723" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/24772723#mh=w0Z603U092000zOYgnl9J-DVzbTI_feSRkSEkyhOQpTqyXCU1CBD85h5wNaSXyhE1CDZl3_VcnlK19fnIMGjeM9aQ_WEz4GliLbFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/24772723/p-kochamy-pana-jezusa-2-cwiczenia.jpg" data-preloader alt="Kochamy Pana Jezusa 2 ćwiczenia">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/412/product_type_cat_image.svg" alt="Podręczniki szkolne"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Kochamy Pana Jezusa 2 ćwiczenia
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 97.600%;"> 4,88 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(11)</span> </span>
   <div class="listing-shops-number">
     w 34 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">9</span><span class="price-fraction">,00</span></span> zł</span><del class="old-price grey-text text-darken-1">12,60 zł</del><span class="price-discount_label">-29<span class="percent">%</span></span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="21511668" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/21511668#mh=H7I3wAJc68000u0y9rQ5D3KYpghh3R0kedCEkyhOQpTqyJtr_brVq8WHu35n_sZj1hdgvPk6bv5s71uuBqqAlHYuj4Y6tqQzFBZwiJIMs23m9XriKZzPI_lMVpzZR8ec8C-QpxyINAA8Pd4gVdf8gjmgjqesoWqO9jpQ6GI6NmicJWopTE8S18nI51fi0wwIUDg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/21511668/p-pamietnik-pani-hanki.jpg" data-preloader alt="Pamiętnik pani Hanki">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/425/product_type_cat_image.svg" alt="Powieści i opowiadania"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Pamiętnik pani Hanki
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 100%;"> 5,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 7 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">17</span><span class="price-fraction">,90</span></span> zł</span> <span class="js_coupon-badge js_no-conv coupon-badge coupon-icon" data-hook="pVBMwlkFDd2PZxB8VFa9PrwTjcZwHuLEUl_7GjTQAgQ=" data-url="/Partials/ProductListCouponDetails" data-header="Kupon"> </span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="40872129" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/40872129#mh=O8S3aqTB66000_0JtnGL8DxlDSOOeeadINiEkyhOQpTqyYp5kr6qodXeXvpjj1FQw0ynwLvXFTMafd2g8LKZPJowqG-wFbKmgsbFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/40872129/p-trylogia-sienkiewicza-potop-ogniem-i-mieczem-pan-wolodyjowski-potop-redivivus-blu-ray.jpg" data-preloader alt="Trylogia Sienkiewicza: Potop / Ogniem i Mieczem / Pan Wołodyjowski / Potop Redivivus (Blu-ray)">
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Trylogia Sienkiewicza: Potop / Ogniem i Mieczem / Pan Wołodyjowski / Potop Redivivus (Blu-ray)
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 100%;"> 5,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 3 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">269</span><span class="price-fraction">,99</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="17035176" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/17035176#mh=S6D0km9f52000AjEfKvPiokmZ4ahWvAKIFSEkyhOQpTqyPpDt_l1b3MeP7ODSJ6E_F9PO8OjyB_o9j4eYgvqhcGy-wYTF8fxG5rFazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/17035176/p-cwiczenia-dla-i-klasy-s-p-jestesmy-w-rodzinie-pana-jezusa.jpg" data-preloader alt="Ćwiczenia dla I klasy S.P. Jesteśmy w rodzinie Pana Jezusa">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/412/product_type_cat_image.svg" alt="Podręczniki szkolne"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Ćwiczenia dla I klasy S.P. Jesteśmy w rodzinie Pana Jezusa
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 93.600%;"> 4,68 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(12)</span> </span>
   <div class="listing-shops-number">
     w 35 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">9</span><span class="price-fraction">,00</span></span> zł</span><del class="old-price grey-text text-darken-1">12,60 zł</del><span class="price-discount_label">-29<span class="percent">%</span></span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="23768176" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/23768176#mh=B7E3gi2319000mBZGYgV0IkvPSsqW2voTXyEkyhOQpTqyvKRSPU3GCVR9dUBelRB3ub8Gj2At6RhwX2RE3L5wOvfmA4Cfu2t5D7FazXZio9YazG_tDQYU0SEzRSqc87J1r7-906fUyfa1O3uKwVenEblh3u9o6yE0JFwEN-HzRnVcddlW0mGZ1auSgfSwhxzRig2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/23768176/p-nowe-fikolki-pana-pierdziolki.jpg" data-preloader alt="Nowe fikołki pana Pierdziołki">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/403/product_type_cat_image.svg" alt="Literatura dla dzieci i młodzieży"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Nowe fikołki pana Pierdziołki
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 97.00%;"> 4,85 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(16)</span> </span>
   <div class="listing-shops-number">
     w 27 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">8</span><span class="price-fraction">,33</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="1478869" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/1478869#mh=G4Y59xUp55000EhiariJoSUS8sX-T3BFuLiV6PUnMGe7PUAYT9eGgLx1prCcc41f4VFeyP3cUGX0ZpNh7-XHmDPWl1V0_Eg_EDP0ddbnYXEbkIzN9elujupKujux5bH6PVrGiy44PeU1Q_7_Mv-g4T71rcHSK5ET14nQLOvjDQTg-6NaWxbbqL3lHjFwXKKkiHg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/1478869/p-w-polskim-londynie-o-sowieckiej-zbrodni-w-katyniu-1940-1956.jpg" data-preloader alt="W polskim Londynie o sowieckiej zbrodni w Katyniu 1940 - 1956">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/409/product_type_cat_image.svg" alt="Historia i literatura faktu"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    W polskim Londynie o sowieckiej zbrodni w Katyniu 1940 - 1956
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 100%;"> 5,00 </span> </span> </span>
   <div class="listing-shops-number">
     w 1 sklepie
   </div>
   <span class="box-list-price"> <span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">8</span><span class="price-fraction">,99</span></span> zł</span> </span>
  </div> </a>
</div>
<div class="js_product-row waves-effect js_man-track-event " data-pid="17081389" style="width:100%">
 <a class="js_product-row__anchor col s12 prod-list-row grey-text text-darken-2" href="/17081389#mh=b7D23spt36000AjEfKvPiokmPcirsauw8lCEkyhOQpTqybHgXAIIea31M4RsxTgkW9WeaTGw6xQOxMkfWtFdezIaNOxdJwaxygP0ddbnYXEbkIzN9elujupKujux5bH6PVrGiy44PeU1Q_7_Mv-g4T71rcHSK5ET14nQLOvjDQTg-6NaWxbbqL3lHjFwXKKkiHg2">
  <div class=" col s4 prod-list-img">
   <img class="responsive-image js_lazyload" src="/Mobile/images/blank.png" data-src="//image.ceneo.pl/data/products/17081389/p-podrecznik-do-nauki-religii-dla-iv-klasy-szkola-podstawowa-sluchamy-pana-boga.jpg" data-preloader alt="Podręcznik do nauki religii dla IV klasy Szkoła Podstawowa " słuchamy pana boga"">
   <span class="subcat-type-icon"><img src="//image.ceneo.pl/data/product_type_cat_image/412/product_type_cat_image.svg" alt="Podręczniki szkolne"></span>
  </div>
  <div class=" col s8 prod-list-content no-padding--left" style="font-size: 0.9rem">
   <div class="list-prod-name">
    Podręcznik do nauki religii dla IV klasy Szkoła Podstawowa "Słuchamy Pana Boga"
   </div>
   <span class="score-container"> <span class="score score--medium"> <span class="score__meter" style="width: 90.0%;"> 4,50 </span> </span> <span style="font-size: 0.8rem; font-weight: 300">(7)</span> </span>
   <div class="listing-shops-number">
     w 34 sklepach
   </div>
   <span class="box-list-price"> <span class="price-from-label">od </span><span class="price-row grey-text text-darken-1"><span class="orange-text text-ceneo-2 m-price"><span class="price-int">15</span><span class="price-fraction">,33</span></span> zł</span> </span>
  </div> </a>
</div>

 */