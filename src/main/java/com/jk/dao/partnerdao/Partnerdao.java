package com.jk.dao.partnerdao;

import com.jk.model.Partner;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Partnerdao {
    @Select("select * from z_partner")
    List<Partner> selectpartner();
    @Insert("insert into z_partner(parname,parcompany,parrelation,startdate,enddate,parstate,parimge) values(#{str.parname},#{str.parcompany},#{str.parrelation},#{str.startdate},#{str.enddate},#{str.parstate},#{str.parimge})")
    void addpartner(@Param("str") Partner str);
    @Update("update z_partner set parstate=2 where id=#{ids}")
    void updatestart();
}
