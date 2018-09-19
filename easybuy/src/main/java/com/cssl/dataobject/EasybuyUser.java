package com.cssl.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@Data
@Entity
public class EasybuyUser implements Serializable {
    @Id
    private String euUserId;
    private String euUserName;
    private String euPassword;
    private char euSex;
    private Date euBirthday;
    private String euIdentityCode;
    private String euEmail;
    private String euMobile;
    private String euAddress;
    private Integer euStatus;
}
