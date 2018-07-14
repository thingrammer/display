package com.fat.display;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface BaseMapper {
    @Select("SELECT * FROM fatsch.basic limit 1")
    Map<String, String> getBasic();
}
