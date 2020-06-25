package com.hzy.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("狗实体")
public class Dog {
    @ApiModelProperty(value = "狗的名字",required = true ,dataType = "String" ,example = "旺财")
    private String name;
    @ApiModelProperty("狗的年龄")
    private int age;

}
