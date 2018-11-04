package com.jk.dao;

import com.jk.model.Cearch;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CearchDao {

    @Insert("insert into z_soushuo(zids,ztext) values(#{ch.zids},#{ch.ztext})")
    void savecaerch(@Param("ch") Cearch ch);

    @Delete("delete from z_soushuo where zids=#{id}")
    void deletech(String id);



    @Select("select * from z_soushuo limit #{start} ,#{pageSize}")
    List<Cearch> selectid(@Param("start") Integer start,@Param("pageSize") Integer pageSize);

    @Select("select count(*) from  z_soushuo")
    long emcount();

}
