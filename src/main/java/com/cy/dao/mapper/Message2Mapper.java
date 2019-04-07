package com.cy.dao.mapper;

import com.cy.entity.Message2;

public interface Message2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message2 record);

    int insertSelective(Message2 record);

    Message2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message2 record);

    int updateByPrimaryKey(Message2 record);
}