package com.example.Team7project;

public class ReadWriteItemDetails {
    public   String name,description,price,Image_url,genere,mobile,address;

    public ReadWriteItemDetails(String name, String description, String price, String image_url, String genere, String mobile,String addresss) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.Image_url=image_url;
        this.genere=genere;
        this.mobile = mobile;
        this.address=addresss;

    }
    public ReadWriteItemDetails(){

    }
}
