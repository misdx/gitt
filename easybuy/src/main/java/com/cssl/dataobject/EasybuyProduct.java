package com.cssl.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@Entity
@Data
public class EasybuyProduct {
    @Id
    private String epId; // 商品id
    private String epName; // 商品名字
    private String epDescription; // 描述
    private BigDecimal epPrice; // 价格
    private Integer epStock;  // 库存
    private Integer epcId; // 一级分类id
    private Integer epcChildId; // 二级分类
    private String epFileName;  // 商品图片
    private BigDecimal epSale;  // 已售
    private Integer epStatus;   // 0为 上架 1为下架
}
