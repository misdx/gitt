package com.cssl.service;

import com.cssl.dataobject.EasybuyUser;

/**
 * Created by MBENBEN on 2018/9/5.
 */
public interface EasybuyUserService {

    EasybuyUser findByEuUserNameAndEuPassword(String enUserName, String euPassword);

}
