package com.yimo.Model;


public class UserDomain {
    private static final long serialVersionUID = -2164058270260403154L;

    private Integer userId;

    private String userName;

    private String password;

    private String phone;


    public UserDomain(){

    }

    public UserDomain(Integer userId, String userName, String password, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
