package com.greedybird.service;

import com.greedybird.dao.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TableService")
public class TableService {
    @Autowired
    TableMapper tableMapper;

    public String getName(int id){
        String name = tableMapper.selectByPrimaryKey(id).getName();
        return name;
    }
}
