package com.zj.service.impl;

import com.zj.entity.Admin;
import com.zj.repo.AdminRepository;
import com.zj.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminRepository adminRepository;
    @Override
    public Admin findByNameAndPassword(String name, String password) {
        return adminRepository.findByNameAndPassword(name,password);
    }
}
