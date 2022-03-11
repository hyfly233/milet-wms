package com.example.simple.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Step implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 是否已删除
     */
    private Boolean deleted;

    /**
     * 前序id
     */
    private Long preStepId;

    /**
     * route id
     */
    private Long routeId;

    private static final long serialVersionUID = 1L;
}