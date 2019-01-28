package com.yimo.Dao;

import com.yimo.Model.UserDomain;

import java.util.List;

public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
