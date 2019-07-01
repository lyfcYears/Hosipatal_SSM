package com.hospital.shiro;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName UserRealm
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/6 10:48
 * @Version 1.0
 **/


import com.hospital.model.admin.User;
import com.hospital.service.admin.UserServer;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:07
 */
public class UserRealm extends AuthorizingRealm {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserServer sysUserService;

    /**
     * 授权 , 进行授权行为
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        User sysUser = (User) principals.getPrimaryPrincipal();
//        List<String> sysPermissions = sysUserService.selectPermissionByUserId(sysUser.getUsername());
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermissions(sysPermissions);
//        LOGGER.info("doGetAuthorizationInfo");
//        return info;


        //给当前用户授权的权限（功能权限、角色）
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //xslde用户拥有user角色
        User user = (User) principals.getPrimaryPrincipal();
        //真实开发中，角色权限从数据库获取
        if (user.getUsername().equals("fc")){
            //设置该用户拥有user角色
            authorizationInfo.addRole("od");
            //设置该用户拥有delete权限
            authorizationInfo.addStringPermission("od:query");
        }
        //admin用户拥有admin角色
        if (user.getUsername().equals("zs")){
            //设置该用户拥有user角色
            authorizationInfo.addRole("zs");
            //设置该用户拥有delete权限
            authorizationInfo.addStringPermission("zs:delete");
        }

        return authorizationInfo;


    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User sysUser = sysUserService.findByUserName(token.getUsername());
        if (sysUser == null) {
            return null;
        }
        LOGGER.info("doGetAuthenticationInfo");
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(sysUser, sysUser.getPassword().toCharArray(),
                getName());
        if(simpleAuthenticationInfo != null)
        System.out.println(simpleAuthenticationInfo.toString()+"---");
        return simpleAuthenticationInfo;
    }


}
