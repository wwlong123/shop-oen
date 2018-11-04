package com.jk.dao.suppt;

import com.jk.model.suppt.Share;
import com.jk.model.suppt.Suppt;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DaoSuppt {

    @Select("select *,a.zname  as  maxname, b.zname as minname  from z_share s ,z_suppt a ,z_suppt b where s.zpid=a.zid and a.zpid=b.zid  and s.ztype=0. limit #{start},#{end} ")
    List<Share> querySuppt(@Param("start") Integer start, @Param("end")Integer pageSize);
    @Update(" UPDATE z_share s SET s.ztype=1 WHERE s.zid=#{id}  ")
    void updateSuppt(@Param("id")Integer id);
}
