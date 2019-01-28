package com.yimo.Model;

import java.util.Date;

public class Product {
    private String SubscriptionId;
    private String ProductId;
    private String Country_Id;
    private Date CreateTime;

    public String getSubscriptionId(String s) {
        return SubscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        SubscriptionId = subscriptionId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getCountry_Id() {
        return Country_Id;
    }

    public void setCountry_Id(String country_Id) {
        Country_Id = country_Id;
    }

    public Date getCreateTime(Date date) {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "SubscriptionId='" + SubscriptionId + '\'' +
                ", ProductId='" + ProductId + '\'' +
                ", Country_Id='" + Country_Id + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }
}
