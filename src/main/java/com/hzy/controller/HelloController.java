package com.hzy.controller;


import com.hzy.bean.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Api(tags = "xxx模块说明")
@RestController
@RequestMapping("/app")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }


    @PostMapping("/hello")
    public String hello1() {
        return "hello! post";
    }


//    @GetMapping("/getUser")
//    public User getUser(){
//        return new User("张三","passw",new Date());
//    }


    @ApiOperation(value = "注入用户接口", notes = "{\"scenicIdArr\" : [53361,53356]}")

    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
//    @ApiImplicitParams(
//            {@ApiImplicitParam(name = "username", value = "用户名", required = true, paramType = "body", dataType = "String", defaultValue = "张三"),
//            @ApiImplicitParam(name="password",value="密码",required=true,paramType="body")}
//            )
    @PostMapping("/post")
    public User insertUser(@RequestBody @ApiParam User user) {
        return user;
    }
}
