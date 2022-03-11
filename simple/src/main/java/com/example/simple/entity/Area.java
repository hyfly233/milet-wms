package com.example.simple.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Area implements Serializable {
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
    * 名称
    */
    private String name;

    /**
    * 1：乱放，2：分行
    */
    private Integer areaType;

    /**
    * 1：乱放，2：双向queue，3：尾插queue，4：stuck
    */
    private Integer lineType;

    /**
    * 最大行数
    */
    private Integer maxRow;

    /**
    * 最大列
    */
    private Integer maxCol;

    /**
    * step id
    */
    private Long stepId;

    /**
    * 溢出区id
    */
    private Long overflowId;

    private static final long serialVersionUID = 1L;
}