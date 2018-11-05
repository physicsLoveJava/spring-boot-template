package com.dummy.app.entity.dummy;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DummyMapper {

    @Select("select * from dummy")
    List<DummyDO> findAll();

}
