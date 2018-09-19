package com.cssl.repository;

import com.cssl.dataobject.EasybuyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by MBENBEN on 2018/9/4.
 */
public interface EasybuyProductRepository extends JpaRepository<EasybuyProduct,String> {
    // 查询所有
    List<EasybuyProduct> findAll();

    // 根据一级分类id 查询所有
    List<EasybuyProduct> findByEpcId(Integer epcId);
    // 根据二级分类id 查询所有
    List<EasybuyProduct> findByEpcChildId(Integer epcChildId);

    // 根据商品id 查询所有
    EasybuyProduct findByEpId(String epId);
}
