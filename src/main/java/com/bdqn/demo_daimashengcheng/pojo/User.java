package com.bdqn.demo_daimashengcheng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel(description = "用户信息请求对象")
public class User implements Serializable {

    private static final long serialVersionUID = -6986638131456347054L;

    @ApiModelProperty(value = "姓名")
    private String username;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
