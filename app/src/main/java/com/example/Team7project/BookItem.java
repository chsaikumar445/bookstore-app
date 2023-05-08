package com.example.Team7project;

public class BookItem {
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemDate,address;

    public String getAddress() {
        return address;
    }

    private String imageUrl,mobile;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BookItem(String itemName, String itemDescription, String itemPrice, String itemDate, String imageUrl,String mobile, String address) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemDate = itemDate;
        this.imageUrl=imageUrl;
        this.mobile=mobile;
        this.address=address;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemDate() {
        return itemDate;
    }
    public String getMobileNumber(){return mobile;}

}
