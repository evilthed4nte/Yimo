package com.yimo.Service.User.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yimo.Dao.UserDao;
import com.yimo.Model.UserDomain;
import com.yimo.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {

    protected static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public int addUser(UserDomain user) {

        userDao.insert(user);

        System.out.println("============================insert之后");
        try{
            // 方案1：从Aop上下文获取代理对象
            UserServiceImpl proxy = (UserServiceImpl) AopContext.currentProxy();
            proxy.child();

        }catch (Exception e){

        }



        return 1;
    }

    /**
     * 测试Transactional REQUIRES_NEW
     * 插入完成后报错 child并没有回滚 因为child事务没有生效
     * AOP：AopProxy 没有生效
     * 因为动态代理(CGLIB,JDK)没有生效
     *
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void child(){
        UserDomain user = new UserDomain();
        user.setUserId(5678);
        user.setUserName("child");
        user.setPassword("password  ");
        user.setPhone("88889998888");
        System.out.println("----------------------插入child之后");
        userDao.insert(user);

        int i = 1/0;
    }

    /**
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
