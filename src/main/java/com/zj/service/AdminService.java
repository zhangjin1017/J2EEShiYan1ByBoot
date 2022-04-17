package com.zj.service;

import com.zj.entity.Admin;
import org.springframework.stereotype.Service;

public interface AdminService {
    //根据用户名和密码查询用户
    Admin findByNameAndPassword(String name, String password);
}
