package com.cssl.repository;

import com.cssl.dataobject.EasybuyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户
 * Created by MBENBEN on 2018/9/4.
 */
public interface EasybuyUserRepository extends JpaRepository<EasybuyUser,String> {

    // 用户登录
    EasybuyUser findByEuUserNameAndEuPassword(String enUserName,String euPassword);


}
