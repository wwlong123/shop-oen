package com.jk.dao;

import com.jk.model.mood;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MoodDao {

    @Select("SELECT TIMESTAMPDIFF(MINUTE,a.tdate,now() ) as datetime ,a.*,b.username from  z_mood a  ,z_user b where a.yid=b.userid ORDER BY a.tdate desc LIMIT 1,3 ")
    List<mood> selectmood();

    @Update("update z_mood a set a.z_zan=a.z_zan+1 ,a.z_count=a.z_count+1 where a.id=#{id} ")
    void addzan(@Param("id") String id);

    @Update("update z_mood a set a.z_cai=a.z_cai+1,a.z_caicount=a.z_caicount+1  where a.id=#{cid}")
    void addcai(@Param("cid") String cid);


    @Update(" UPDATE z_mood a set a.z_count =0 ,a.z_caicount=0 where a.z_count != 0 or a.z_caicount !=0")
    void selectLogInfo();
    @Select("select a.*,b.username, b.userdengjiid from  z_mood a,z_user b where a.yid=b.userid")
    List<mood> selectcearch();

    @Insert("insert into z_mood(yid,z_zan,z_cai,testarea,z_count,z_caicount,tdate) values(#{mood.yid},'0','0',#{mood.testarea},0,0,SYSDATE()  )")
    void savexinqing(@Param("mood") mood mood);
}
