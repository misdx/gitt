package com.cssl.service.impl;

import com.cssl.dataobject.EasybuyProduct;
import com.cssl.enums.ResultEnum;
import com.cssl.exception.EasybuyException;
import com.cssl.repository.EasybuyProductRepository;
import com.cssl.service.EasybuyProductService;
import com.cssl.utils.ProductKeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@Slf4j
@Service
public class EasybuyProductServiceImpl implements EasybuyProductService {

    @Autowired
    private EasybuyProductRepository easybuyProductRepository;

    // 保存商品
    @Override
    @Transactional
    public EasybuyProduct saveProduct(EasybuyProduct easybuyProduct) {
        EasybuyProduct easybuy = new EasybuyProduct();
        // 商品id生成
        String productKey = ProductKeyUtil.getProductKey();
        // 随机生成 商品id
        easybuyProduct.setEpId(productKey);
        BeanUtils.copyProperties(easybuyProduct, easybuy);
        // 新增商品
        EasybuyProduct saveProduct = easybuyProductRepository.save(easybuy);
        if (saveProduct == null) {
            log.error("【新增商品】商品新增失败,easybuyId={}", easybuyProduct.getEpId());
            throw new EasybuyException(ResultEnum.INSERT_PRODUCT_ERROR);
        }

        return saveProduct;
    }

    // 加库存
    @Override
    public void insertStock() {

    }

    // 减库存
    @Override
    public void reduceStock() {

    }

    // 查询所有商品
    @Override
    public List<EasybuyProduct> findAll() {
        return easybuyProductRepository.findAll();
    }

    // 根据商品一级分类id 查询商品
    @Override
    public List<EasybuyProduct> findByEpcId(Integer epcId) {
        return null;
    }

    // 根据商品二级分类id 查询商品
    @Override
    public List<EasybuyProduct> findByEpcChildId(Integer epcChildId) {
        return null;
    }
}
