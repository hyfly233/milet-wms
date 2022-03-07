package com.milet.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@TableName(value = "t_production_line")
public class ProductionLine extends BaseEntity implements Serializable {

    @TableField(value = "`name`")
    private String name;

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String COL_NAME = "name";
}