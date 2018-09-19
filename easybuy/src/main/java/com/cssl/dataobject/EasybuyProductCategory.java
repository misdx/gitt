package com.cssl.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@Entity
@Data
public class EasybuyProductCategory {
    @Id
    private Integer epcId;
    private String  epcName;
    private String epcParentId;
}
