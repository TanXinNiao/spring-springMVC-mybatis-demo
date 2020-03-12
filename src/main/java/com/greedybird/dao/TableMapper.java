package com.greedybird.dao;

import com.greedybird.model.Table;

public interface TableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Table record);

    int insertSelective(Table record);

    Table selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);

}