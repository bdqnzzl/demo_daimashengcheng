package com.bdqn.demo_daimashengcheng.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dateapi")
@Api(value = "日期管理API")
public class DateController {

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParam(paramType = "query",name= "cityid" ,value = "城市id",dataType = "string")
    @ApiOperation(value = "通过城市id获取天气信息", notes="返回城市天气信息")
    public ResponseEntity<Object> getDateInfo(HttpServletRequest request) {
        return new ResponseEntity<>("acdsf", HttpStatus.OK);
    }
}