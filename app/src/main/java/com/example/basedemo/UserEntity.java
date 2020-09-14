package com.example.basedemo;

import java.util.List;

/**
 * @author lxg
 */
public class UserEntity {


    private List<HomePageAdvertisingsBean> homePageAdvertisings;
    private List<SupplierUserListBean> supplierUserList;
    private List<GoodsCategoryListBean> goodsCategoryList;
    private List<PointGoodsListBean> pointGoodsList;
    private List<RecGoodsListBean> recGoodsList;

    public List<HomePageAdvertisingsBean> getHomePageAdvertisings() {
        return homePageAdvertisings;
    }

    public void setHomePageAdvertisings(List<HomePageAdvertisingsBean> homePageAdvertisings) {
        this.homePageAdvertisings = homePageAdvertisings;
    }

    public List<SupplierUserListBean> getSupplierUserList() {
        return supplierUserList;
    }

    public void setSupplierUserList(List<SupplierUserListBean> supplierUserList) {
        this.supplierUserList = supplierUserList;
    }

    public List<GoodsCategoryListBean> getGoodsCategoryList() {
        return goodsCategoryList;
    }

    public void setGoodsCategoryList(List<GoodsCategoryListBean> goodsCategoryList) {
        this.goodsCategoryList = goodsCategoryList;
    }

    public List<PointGoodsListBean> getPointGoodsList() {
        return pointGoodsList;
    }

    public void setPointGoodsList(List<PointGoodsListBean> pointGoodsList) {
        this.pointGoodsList = pointGoodsList;
    }

    public List<RecGoodsListBean> getRecGoodsList() {
        return recGoodsList;
    }

    public void setRecGoodsList(List<RecGoodsListBean> recGoodsList) {
        this.recGoodsList = recGoodsList;
    }

    public static class HomePageAdvertisingsBean {
        /**
         * id : 56
         * imagesUrl : /upload/mavendemo/bannerImages/20200907/1599479064717106190.jpg
         * mobileImagesUrl :
         * linkAddress : 118
         * title : 诺丽果汁
         * bgImagesUrl : null
         * activity_id : GOODS
         * keyWord : homePage
         * seriesNumber : 4
         * color : #FFFFFF
         * previewUrl : app
         * imageUsageId : 1
         * isShow : true
         */

        private int id;
        private String imagesUrl;
        private String mobileImagesUrl;
        private String linkAddress;
        private String title;
        private Object bgImagesUrl;
        private String activity_id;
        private String keyWord;
        private int seriesNumber;
        private String color;
        private String previewUrl;
        private int imageUsageId;
        private boolean isShow;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImagesUrl() {
            return imagesUrl;
        }

        public void setImagesUrl(String imagesUrl) {
            this.imagesUrl = imagesUrl;
        }

        public String getMobileImagesUrl() {
            return mobileImagesUrl;
        }

        public void setMobileImagesUrl(String mobileImagesUrl) {
            this.mobileImagesUrl = mobileImagesUrl;
        }

        public String getLinkAddress() {
            return linkAddress;
        }

        public void setLinkAddress(String linkAddress) {
            this.linkAddress = linkAddress;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getBgImagesUrl() {
            return bgImagesUrl;
        }

        public void setBgImagesUrl(Object bgImagesUrl) {
            this.bgImagesUrl = bgImagesUrl;
        }

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public String getKeyWord() {
            return keyWord;
        }

        public void setKeyWord(String keyWord) {
            this.keyWord = keyWord;
        }

        public int getSeriesNumber() {
            return seriesNumber;
        }

        public void setSeriesNumber(int seriesNumber) {
            this.seriesNumber = seriesNumber;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPreviewUrl() {
            return previewUrl;
        }

        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        public int getImageUsageId() {
            return imageUsageId;
        }

        public void setImageUsageId(int imageUsageId) {
            this.imageUsageId = imageUsageId;
        }

        public boolean isIsShow() {
            return isShow;
        }

        public void setIsShow(boolean isShow) {
            this.isShow = isShow;
        }
    }

    public static class SupplierUserListBean {
        /**
         * id : 6
         * supplierName : 傲之美海外化妆品专营
         * supplierCode : azm
         * userName :
         * mobile :
         * mallLogo : /upload/mavendemo/mallLogo/20200807/1596786373554275565.jpg
         * mallFirstImg : /upload/mavendemo/mallFirstImg/20200809/1596903315129348609.jpg
         * mallBgImg : /upload/mavendemo/mallBgImg/20200808/1596901941216073826.png
         * mallInfoImg :
         * isShow : 1
         * status : 1
         * sort : 6
         */

        private int id;
        private String supplierName;
        private String supplierCode;
        private String userName;
        private String mobile;
        private String mallLogo;
        private String mallFirstImg;
        private String mallBgImg;
        private String mallInfoImg;
        private int isShow;
        private int status;
        private int sort;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getSupplierCode() {
            return supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMallLogo() {
            return mallLogo;
        }

        public void setMallLogo(String mallLogo) {
            this.mallLogo = mallLogo;
        }

        public String getMallFirstImg() {
            return mallFirstImg;
        }

        public void setMallFirstImg(String mallFirstImg) {
            this.mallFirstImg = mallFirstImg;
        }

        public String getMallBgImg() {
            return mallBgImg;
        }

        public void setMallBgImg(String mallBgImg) {
            this.mallBgImg = mallBgImg;
        }

        public String getMallInfoImg() {
            return mallInfoImg;
        }

        public void setMallInfoImg(String mallInfoImg) {
            this.mallInfoImg = mallInfoImg;
        }

        public int getIsShow() {
            return isShow;
        }

        public void setIsShow(int isShow) {
            this.isShow = isShow;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }
    }

    public static class GoodsCategoryListBean {
        /**
         * id : 2
         * name : 美容
         * icon : /upload/mavendemo/book/20200407/1586231096581976950.png
         * showStatus : 0
         * sort : 3
         * keyword : meirong
         */

        private int id;
        private String name;
        private String icon;
        private int showStatus;
        private int sort;
        private String keyword;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getShowStatus() {
            return showStatus;
        }

        public void setShowStatus(int showStatus) {
            this.showStatus = showStatus;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }
    }

    public static class PointGoodsListBean {
        /**
         * goodsId : 58
         * goodsTitle : AGS | 利唐品复合燕麦麸椰蓉粉1盒装
         * goodsImg : /upload/mavendemo/book/20200327/1585297567032367195.jpg
         * price : 16900
         * nowPrice : 13900
         * groupPrice : null
         */

        private int goodsId;
        private String goodsTitle;
        private String goodsImg;
        private int price;
        private int nowPrice;
        private Object groupPrice;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsTitle() {
            return goodsTitle;
        }

        public void setGoodsTitle(String goodsTitle) {
            this.goodsTitle = goodsTitle;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        public void setGoodsImg(String goodsImg) {
            this.goodsImg = goodsImg;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNowPrice() {
            return nowPrice;
        }

        public void setNowPrice(int nowPrice) {
            this.nowPrice = nowPrice;
        }

        public Object getGroupPrice() {
            return groupPrice;
        }

        public void setGroupPrice(Object groupPrice) {
            this.groupPrice = groupPrice;
        }
    }

    public static class RecGoodsListBean {
        /**
         * goodsId : 50
         * goodsTitle : 卡其芙 | 医用冷敷贴10盒装（5片/盒）
         * goodsImg : /upload/mavendemo/book/20200323/1584951343625455719.jpg
         * price : 268000
         * nowPrice : 19900
         * groupPrice : null
         */

        private int goodsId;
        private String goodsTitle;
        private String goodsImg;
        private int price;
        private int nowPrice;
        private Object groupPrice;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsTitle() {
            return goodsTitle;
        }

        public void setGoodsTitle(String goodsTitle) {
            this.goodsTitle = goodsTitle;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        public void setGoodsImg(String goodsImg) {
            this.goodsImg = goodsImg;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNowPrice() {
            return nowPrice;
        }

        public void setNowPrice(int nowPrice) {
            this.nowPrice = nowPrice;
        }

        public Object getGroupPrice() {
            return groupPrice;
        }

        public void setGroupPrice(Object groupPrice) {
            this.groupPrice = groupPrice;
        }
    }
}
