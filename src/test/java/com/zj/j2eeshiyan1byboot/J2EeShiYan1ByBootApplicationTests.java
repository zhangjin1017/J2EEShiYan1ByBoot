package com.zj.j2eeshiyan1byboot;

import com.zj.entity.Admin;
import com.zj.repo.AdminRepository;
import com.zj.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class J2EeShiYan1ByBootApplicationTests {

    @Resource
    AdminRepository adminRepository;
    //admin登录测试
    @Test
    public void adminLogin(){
        System.out.println("admin登录测试");
        Admin admin = adminRepository.findByNameAndPassword("admin", "admin");
        System.out.println(admin);
    }

}
