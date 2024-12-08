package com.loltoulan.dockefiledeploy.entty;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("t_data_info")
@AllArgsConstructor
@NoArgsConstructor
public class DataInfoEntity {
    @TableId
    private Integer id;
    @TableField(value = "info_desc")
    private String infoDesc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
