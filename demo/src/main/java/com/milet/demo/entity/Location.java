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
@TableName(value = "t_location")
public class Location extends BaseEntity implements Serializable {

    @TableField(value = "area_id")
    private Long areaId;

    /**
     * 行
     */
    @TableField(value = "`row`")
    private Integer row;

    /**
     * 列
     */
    @TableField(value = "colum")
    private Integer colum;

    /**
     * 零件号
     */
    @TableField(value = "part_no")
    private String partNo;

    /**
     * 是否预定
     */
    @TableField(value = "booked")
    private Boolean booked;

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String COL_AREA_ID = "area_id";

    public static final String COL_ROW = "row";

    public static final String COL_COLUM = "colum";

    public static final String COL_PART_NO = "part_no";

    public static final String COL_BOOKED = "booked";
}