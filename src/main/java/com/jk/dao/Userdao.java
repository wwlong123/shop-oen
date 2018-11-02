package com.jk.dao;

import com.jk.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Userdao {
    @Insert("insert into z_user(username,usereamil,userpass) values(#{str.username},#{str.usereamil},#{str.userpass})")
    void adduser(@Param("str") Users str);

    @Select("select * from z_user where usereamil=#{usereamil} and userpass=#{userpass}")
    Users userpas(@Param("usereamil") String usereamil,@Param("userpass") String userpass);
}
