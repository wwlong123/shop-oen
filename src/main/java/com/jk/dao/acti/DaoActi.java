package com.jk.dao.acti;

import com.jk.model.suppt.Activity;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DaoActi {

    @Select("select * from z_HDht ")
    List<Activity> queryActivity();
    @Update(" UPDATE z_HDht s SET s.htype=0 WHERE s.hid=#{id}  ")
    void updateActivityt(Integer id);
}
