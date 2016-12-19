package com.yuyanzhe.mybatis.numymapper;

import com.yuyanzhe.mybatis.numybeans.ConContract;

public interface ConContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConContract record);

    int insertSelective(ConContract record);

    ConContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConContract record);

    int updateByPrimaryKey(ConContract record);
}