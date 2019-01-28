package com.yimo.Dao;

import com.yimo.Model.Product;

import java.util.List;

public interface ProductDao {


    int updateProduct(Product product);

    int insert(Product product);

    int deleteProduct(Product product);

    List<Product> queryProduct();
}
