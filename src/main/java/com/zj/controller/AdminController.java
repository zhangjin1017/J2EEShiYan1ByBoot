package com.zj.controller;

import com.zj.entity.Admin;
import com.zj.entity.resp.RestBean;
import com.zj.service.AdminService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    AdminService adminService;
    @PostMapping("/login")
        public RestBean<Admin> login(@RequestParam("name") String name, @RequestParam("password") String password){
        System.out.println(name+" "+password);
        Admin admin = adminService.findByNameAndPassword(name, password);

        return new RestBean<>(200,"请求成功",admin);
    }
}
