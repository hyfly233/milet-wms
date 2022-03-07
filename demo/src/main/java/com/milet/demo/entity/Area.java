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
@TableName(value = "t_area")
public class Area extends BaseEntity implements Serializable {

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 1：乱放，2：分行
     */
    @TableField(value = "area_type")
    private Integer areaType;

    /**
     * 1：乱放，2：双向queue，3：尾插queue，4：stuck
     */
    @TableField(value = "line_type")
    private Integer lineType;

    /**
     * 最大行数
     */
    @TableField(value = "max_row")
    private Integer maxRow;

    /**
     * 最大列
     */
    @TableField(value = "max_colum")
    private Integer maxColum;

    /**
     * step id
     */
    @TableField(value = "step_id")
    private Long stepId;

    /**
     * 溢出区id
     */
    @TableField(value = "overflow_id")
    private Long overflowId;

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String COL_NAME = "name";

    public static final String COL_AREA_TYPE = "area_type";

    public static final String COL_LINE_TYPE = "line_type";

    public static final String COL_MAX_ROW = "max_row";

    public static final String COL_MAX_COLUM = "max_colum";

    public static final String COL_STEP_ID = "step_id";

    public static final String COL_OVERFLOW_ID = "overflow_id";
}