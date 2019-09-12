package com.mfl.myblog.controller;

import com.mfl.myblog.model.DTO.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(value = "LoginController", tags = "用户登录LoginController", description = "用户登录LoginController")
public class LoginController {

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public JsonResult index(){
        return new JsonResult().success();
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public JsonResult test(){
        return new JsonResult().success();
    }
}
