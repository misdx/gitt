package com.cssl.service.impl;

import com.cssl.dataobject.EasybuyUser;
import com.cssl.enums.ResultEnum;
import com.cssl.exception.EasybuyException;
import com.cssl.repository.EasybuyUserRepository;
import com.cssl.service.EasybuyUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MBENBEN on 2018/9/5.
 */
@Service
@Slf4j
public class EasybuyUserServiceImpl implements EasybuyUserService {

    @Autowired
    private EasybuyUserRepository easybuyUserRepository;

    @Override
    public EasybuyUser findByEuUserNameAndEuPassword(String enUserName, String euPassword) {

        EasybuyUser easybuyUser = easybuyUserRepository.findByEuUserNameAndEuPassword(enUserName, euPassword);
        if (easybuyUser == null) {
            return null;
        }
        return easybuyUser;
    }
}
