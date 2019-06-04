package org.spring.boot.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String govCode;

    private String userName;

    private String userCode;

    private String userPassword;

    private Date createTime;

    private Date updateTime;

}