package com.jk.dao.suppt;



import com.jk.model.suppt.Manage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface ManageDao {
    @Select("select * from z_suppt z where z.zpid=#{0}")
    List<Manage> selectManage(int i);
    @Insert(" insert  into z_share(ztitle,zshowop,zpid,ztime)  values(#{title},#{btext},#{topics},#{time})   ")
    void addfx(@Param("title") String title, @Param("btext")String btext, @Param("topics")String topics, @Param("time")Date time);
}
