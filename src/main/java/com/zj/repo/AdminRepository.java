package com.zj.repo;

import com.zj.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
        //根据用户名和密码查询用户
        Admin findByNameAndPassword(String name, String password);
}
