package com.yue.springsecurityjwtlogindemo2.controllers;

import com.yue.springsecurityjwtlogindemo2.utils.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Description TODO
 * @Author YueLi/xiroiyuki@hotmail.com
 * @Time 2021/3/2 0:01
 */
@Api(value = "处理登录、退出请求")
@RestController
public class LoginoutController {
    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean userLogout(){
        return RespBean.success("退出成功!");
    }
}
