package com.jk.dao.boke;

import com.jk.model.boke.boke;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BoDao {
    @Insert("insert into z_boke(creDate,btext,title,count,browse) values(#{boke.creDate},#{boke.btext},#{boke.title},#{boke.count},#{boke.browse})")
    void saveBoke(@Param("boke") boke boke);

    @Select("select * ,CONCAT(convert(DATE_FORMAT(b.creDate,'%m'), char),'月',convert(DATE_FORMAT(b.creDate,'%d'), char),'日') as endCreate from z_user u,z_boke b WHERE u.userid=b.uid")
    List<boke> selectBoke();
    @Select("select *  from z_user u,z_boke b WHERE u.userid=b.uid  and b.bid=#{bo.bId}")
    boke queryBoke(@Param("bo") boke bo);
    @Update("update z_boke set browse=browse+1 where bid=#{bo.bId}")
    void updateBoke(@Param("bo")boke bo);
    @Select("select count(*) from z_user u,z_boke b WHERE u.userid=b.uid ")
    long findBokeCount();
    @Select("select * ,CONCAT(convert(DATE_FORMAT(b.creDate,'%m'), char),'月',convert(DATE_FORMAT(b.creDate,'%d'), char),'日') as endCreate from z_user u,z_boke b WHERE u.userid=b.uid  limit #{0} ,#{1}")
    List<boke> findBokeList(int start, int pageSize);
    @Update("update z_boke set state=1 where bid=#{bo.bId}")
    void updateBokeState(@Param("bo")boke boke);
}
