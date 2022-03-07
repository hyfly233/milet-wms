package com.milet.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@TableName(value = "t_part")
public class Part extends BaseEntity implements Serializable {

    @TableField(value = "part_no")
    private String partNo;

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String COL_PART_NO = "part_no";
}