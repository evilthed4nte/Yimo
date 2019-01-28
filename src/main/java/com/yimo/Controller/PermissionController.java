package com.yimo.Controller;

import com.yimo.Service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    @ResponseBody
    @RequestMapping("/permission")
    public int permission(){
        return permissionService.queryPermission();
    }
}
