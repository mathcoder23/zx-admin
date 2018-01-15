package com.mt23.zhongxin.admin.dao;

import com.mt23.zhongxin.admin.entity.BaseUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends  JpaRepository<BaseUserEntity, String>, JpaSpecificationExecutor<BaseUserEntity> {
    BaseUserEntity findByUsernameAndPassword(String Username,String Password);

}
