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
@TableName(value = "t_step")
public class Step extends BaseEntity implements Serializable {

    /**
     * 前序id
     */
    @TableField(value = "pre_step_id")
    private Long preStepId;

    /**
     * route id
     */
    @TableField(value = "route_id")
    private Long routeId;

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String COL_PRE_STEP_ID = "pre_step_id";

    public static final String COL_ROUTE_ID = "route_id";
}