package com.yimo.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yimo.Dao.ProductDao;
import com.yimo.Model.Product;
import com.yimo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("proService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;


    @Override
    public int addProduct(Product product) {
        return productDao.insert(product);
    }

    @Override
    public int deleteProduct(Product product) {
        return productDao.deleteProduct(product);
    }

    @Override
    public int updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public PageInfo<Product> queryProduct(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Product> productList = productDao.queryProduct();
        PageInfo result = new PageInfo(productList);
        return result;
    }
}