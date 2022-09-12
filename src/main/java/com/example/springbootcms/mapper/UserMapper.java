package com.example.springbootcms.mapper;

import com.example.springbootcms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //注入
public interface UserMapper {

    @Select("SELECT * from sys_user")
    List<User> findAll();
}
