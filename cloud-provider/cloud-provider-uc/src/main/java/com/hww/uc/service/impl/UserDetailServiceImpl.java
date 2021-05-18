package com.hww.uc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.TSysUser;
import com.hww.uc.dto.SecurityUser;
import com.hww.uc.mapper.TSysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private TSysUserMapper tSysUserMapper;

    /***
     * 根据账号获取用户信息
     * @param username:
     * @return: org.springframework.security.core.userdetails.UserDetails
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中取出用户信息
        //TSysUser user = userService.selectByUsername(username);
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("username",username);
        TSysUser tSysUser = tSysUserMapper.selectOne(query);
        // 判断用户是否存在
        if (null == tSysUser){
            throw new UsernameNotFoundException("用户名不存在！");
        }
        // 返回UserDetails实现类
//        TSysUser sysUser = new TSysUser();
//        BeanUtils.copyProperties(tSysUser,sysUser);

//        List<String> authorities = permissionService.selectPermissionValueByUserId(user.getId());
//        SecurityUser securityUser = new SecurityUser(curUser);
//        securityUser.setPermissionValueList(authorities);
        return new SecurityUser(tSysUser);
    }
}
