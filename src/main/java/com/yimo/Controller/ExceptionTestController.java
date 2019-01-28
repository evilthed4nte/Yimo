package com.yimo.Controller;

import com.yimo.Exception.CustomException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionTestController {
    @RequestMapping("/exce")
    public String test(Integer num){

        if (num == null){
            throw new CustomException(400,"num不能为空");
        }

        int i = 10 / num;
        return "result:" + i ;

    }
}
