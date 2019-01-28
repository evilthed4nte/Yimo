package com.yimo.Service.Impl;

import com.yimo.Dao.PermissionDao;
import com.yimo.Model.Permission;
import com.yimo.Service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionDao permissionDao;

    @Override
    public int queryPermission() {
        return permissionDao.queryPermission();
    }
}
