package com.cssl.repository;

import com.cssl.dataobject.EasybuyProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EasybuyProductRepositoryTest {

    @Autowired
    private EasybuyProductRepository easybuyProductRepository;

    @Test
    public void findAll() throws Exception {
        List<EasybuyProduct> all = easybuyProductRepository.findAll();
        all.forEach(i -> System.out.println(i));
    }

    @Test
    public void findByEpcId(){
        List<EasybuyProduct> byEpcId = easybuyProductRepository.findByEpcId(542);
        byEpcId.forEach(i -> System.out.println(i));
    }

    @Test
    public void findByEpcChildId(){
        List<EasybuyProduct> byEpcId = easybuyProductRepository.findByEpcChildId(627);
        byEpcId.forEach(i -> System.out.println(i));
    }

    @Test
    public void findByEpId(){
        EasybuyProduct byEpId = easybuyProductRepository.findByEpId("601");
        System.out.println(byEpId);
    }

}