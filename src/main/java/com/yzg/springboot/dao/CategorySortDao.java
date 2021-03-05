package com.yzg.springboot.dao;

import com.yzg.springboot.entity.CategorySort;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategorySortDao {
    int deleteByPrimaryKey(Long catId);

    int insert(CategorySort record);

    int insertSelective(CategorySort record);

    CategorySort selectByPrimaryKey(Long catId);

    int updateByPrimaryKeySelective(CategorySort record);

    int updateByPrimaryKey(CategorySort record);
}