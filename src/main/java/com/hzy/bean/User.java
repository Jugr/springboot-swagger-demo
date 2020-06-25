package com.hzy.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("用户实体")
public class User {
    @ApiModelProperty(value = "用户名",example = "老李")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty(value = "创建日期",hidden = true)
    private Date createTime;

    @ApiModelProperty("user的狗狗们")
    private List<Dog> dogList;
}