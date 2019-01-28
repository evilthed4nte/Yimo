package com.yimo.Model;

import java.util.Date;

public class Permission {

    private String product_name;
    private String product_id;
    private String activity_name;
    private String activity_id;
    private Date expdate;

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProducr_id() {
        return product_id;
    }

    public void setProducr_id(String producr_id) {
        this.product_id = producr_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "product_name='" + product_name + '\'' +
                ", producr_id='" + product_id + '\'' +
                ", activity_name='" + activity_name + '\'' +
                ", activity_id='" + activity_id + '\'' +
                ", expdate=" + expdate +
                '}';
    }
}
