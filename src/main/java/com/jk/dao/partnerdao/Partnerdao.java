package com.jk.dao.partnerdao;

import com.jk.model.Partner;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Partnerdao {
    @Select("select * from z_partner")
    List<Partner> selectpartner();
    @Insert("insert into z_partner(parname,parcompany,parrelation,startdate,enddate,parstate,parimge) values(#{str.parname},#{str.parcompany},#{str.parrelation},#{str.startdate},#{str.enddate},#{str.parstate},#{str.parimge})")
    void addpartner(@Param("str") Partner str);
    @Update("update z_partner set parstate=2 where id=#{ids}")
    void updatestart();
    @Delete("delete from z_partner where id=#{userid}")
    void delpartner(@Param("userid") Integer userid);
    @Select(" SELECT *,(  SELECT timestampdiff(DAY, SYSDATE(), z.enddate) )u FROM z_partner z " +
            "WHERE ( SELECT timestampdiff(DAY, SYSDATE(), z.enddate) ) " +
            "< 20 AND ( SELECT timestampdiff(DAY, SYSDATE(), z.enddate) ) % 2 = 0 AND " +
            "( SELECT timestampdiff(DAY, SYSDATE(), z.enddate)) >=5;" )
    List<Partner> selectpartnerEnd();

    @Select("SELECT *,(SELECT timestampdiff(DAY, SYSDATE(), z.enddate) )u FROM z_partner z  " +
            "WHERE ( SELECT timestampdiff(DAY, SYSDATE(), z.enddate) ) < 5 " +
            " AND ( SELECT timestampdiff(DAY, SYSDATE(), z.enddate)) >0; ")
    List<Partner> selectpartnerEndUpdate();
    @Update(" UPDATE z_partner z  SET z.parstate = 2" +
            "WHERE  z.id = #{ids}  ")
    void updatePartner(Integer ids);
}
