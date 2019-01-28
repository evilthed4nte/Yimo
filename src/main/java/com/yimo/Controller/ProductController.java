package com.yimo.Controller;

import com.github.pagehelper.PageInfo;
import com.yimo.Model.Product;
import com.yimo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService proService;

    @ResponseBody
    @RequestMapping("/add")
    public int add(Product product){
        return proService.addProduct(product);
    }

    @ResponseBody
    @RequestMapping("/delete")
    public int delete(Product product){
        return proService.deleteProduct(product);
    }

    @ResponseBody
    @RequestMapping("/update")
    public int update(Product product){
        return proService.updateProduct(product);
    }

    @ResponseBody
    @RequestMapping("/query")
    public PageInfo<Product> queryProduct(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                                      int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                                                      int pageSize){
        return proService.queryProduct(pageNum,pageSize);
    }
}
