package com.cssl.service;

import com.cssl.dataobject.EasybuyProduct;

import java.util.List;

/**
 * Created by MBENBEN on 2018/9/4.
 */
public interface EasybuyProductService {

    // 新增商品
    EasybuyProduct saveProduct(EasybuyProduct easybuyProduct);
    // 下架商品

    // 上架商品

    // 修改商品信息

    // 加库存 无需返回 如果报错则表示失败
    void insertStock();

    // 减库存 无需返回 如果报错则表示失败
    void reduceStock();

    // 查询所有
    List<EasybuyProduct> findAll();

    // 根据一级分类id 查询所有
    List<EasybuyProduct> findByEpcId(Integer epcId);
    // 根据二级分类id 查询所有
    List<EasybuyProduct> findByEpcChildId(Integer epcChildId);


}
