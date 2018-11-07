package com.jk.dao;

import com.jk.model.Htuser;
import com.jk.model.Usernb;
import com.jk.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Userdao {
    @Insert("insert into z_user(username,usereamil,userpass) values(#{str.username},#{str.usereamil},#{str.userpass})")
    void adduser(@Param("str") Users str);

    @Select("select z.*,b.usernb from z_user z ,z_usernb b where z.userid=b.userid and z.usereamil=#{usereamil} and z.userpass=#{userpass}")
    Users userpas(@Param("usereamil") String usereamil,@Param("userpass") String userpass);

    @Insert("insert into z_userzl(username,usersex,usersuozaidi,usershoujihao,userdizhi,userzsname,userjieji) value(#{str.username},#{str.usersex},#{str.usersuozaidi},#{str.usershoujihao},#{str.userdizhi},#{str.userzsname},#{str.userjieji})")
    void addhoutai(@Param("str") Htuser str);
    @Update("update z_user set userpass=#{userpass.userpass} where userid=#{userpass.userid}")
    void updateuser(@Param("userpass") Users userpass);
    @Update("update z_user set userimge=#{str.userimge} where userid=#{str.userid}")
    void updatetupian(@Param("str") Users str);

    @Insert("insert into z_usernb(userid,usernb) values(#{1},#{0})")
    void addusernb(Integer usernb,Integer userid);
    @Select("select * from z_usernb where userid=#{0}")
    Integer selectusernb(Integer userid);
    @Update("update z_usernb set usernb=usernb+#{0} where userid=#{1}")
    void updateusernb(Integer usernb,Integer userid);
}
