package com.yzg.springboot.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * category_sort
 * @author 
 */
@Data
public class CategorySort implements Serializable {
    /**
     * 分类id
     */
    private Long catId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类id
     */
    private Long parentCid;

    /**
     * 层级
     */
    private Integer catLevel;

    /**
     * 是否显示[0-不显示，1显示]
     */
    private Byte showStatus;

    /**
     * 排序
     */
    private Integer sort;

    private List<CategorySort> childrens;

    private static final long serialVersionUID = 1L;
}