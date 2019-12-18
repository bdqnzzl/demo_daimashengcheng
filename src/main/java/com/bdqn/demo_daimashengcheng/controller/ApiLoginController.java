package com.bdqn.demo_daimashengcheng.controller;

import com.bdqn.demo_daimashengcheng.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(value = "用户信息", tags = { "用户信息" })
@RestController
public class ApiLoginController {

    @ApiOperation(value = "用户信息分页查询123")
    @GetMapping("/get")
    public String get(){
        return "Hello Swagger2";
    }

    @ApiOperation(value = "用户信息分页查询")
    @GetMapping("/page")
    public String page(User user) {
        return "Hello Swagger2";
    }

    @ApiOperation(value = "用户信息查询" ,response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "file", value = "文件导入", required = true, dataType = "MultipartFile")
    })
    @GetMapping("/id")
    public User getUser(Integer id, MultipartFile file) {
        User user  = new User();
        user.setAge(id);
        return new User();
    }

}
