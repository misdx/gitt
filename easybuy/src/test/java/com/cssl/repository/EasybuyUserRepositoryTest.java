package com.cssl.repository;

import com.cssl.dataobject.EasybuyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EasybuyUserRepositoryTest {

    @Autowired
    private EasybuyUserRepository easybuyUserRepository;

    @Test
    public void findByEuUserNameAndEuPassword() throws Exception {

        EasybuyUser admin = easybuyUserRepository.findByEuUserNameAndEuPassword("ad", "123456");
        System.out.println(admin);

    }

}