package com.jk.dao;

import com.jk.model.*;
import com.jk.model.Modeljihe.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MoodDao {

    @Select("SELECT TIMESTAMPDIFF(MINUTE,a.tdate,now() ) as datetime ,a.*,b.username ,b.userdengjiid from  z_mood a  ,z_user b where a.yid=b.userid ORDER BY a.tdate desc LIMIT 1,3 ")
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

    @Select("select *from z_soushuo")
    List<Cearch> guanjianzi();


    @Select(" select *from  z_share a ORDER BY a.ztime desc")
    List<Share> selectshare();

    @Select("select *from  z_questions a ORDER BY a.questionsDate DESC")
    List<Questions> selectmoodService();

    @Select(" select *from  z_boke a  ORDER BY  a.creDate desc  ")
    List<boke> selectboke();

    @Select("select *from  z_user a ORDER BY  a.userdengjiid desc")
    List<Users> selectUsers();
    @Update("update z_user set userdengjiid=userdengjiid+1 where userid=3 ")
    void updatedengji();

    @Update("update z_user set  yuefile=#{yuefile} where userid=3 ")
    void update(@Param("yuefile") String yuefile);
   //查询广告
    @Select(" select  *from  z_partner a where a.parstate=1")
    List<Partner> selecPartner();
    //广告定时跟新
    @Select(" select  *from  z_partner a where a.parstate=1")
    List<Partner> tupian();

    @Select("select *from  z_share a ORDER BY a.zbrowse DESC LIMIT 1,5")
    List<Share> chaxunshare();
}
