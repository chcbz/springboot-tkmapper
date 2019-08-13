package com.modificial.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BaseEntity {


    @ApiModelProperty(value = "创建时间", example = "2019-08-13 21:31:42")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date createTime;
    @ApiModelProperty(value = "最后更新时间", example = "2019-08-13 21:31:42")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date updateTime;
    @ApiModelProperty(value = "状态 1有效 0无效")
    Integer status;
}
