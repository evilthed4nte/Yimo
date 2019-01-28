package com.yimo.Service;

import com.github.pagehelper.PageInfo;
import com.yimo.Model.Product;


public interface ProductService {

    int addProduct(Product product);

    int deleteProduct(Product product);

    int updateProduct(Product product);

    PageInfo<Product> queryProduct(int pageNum, int pageSize);
}
