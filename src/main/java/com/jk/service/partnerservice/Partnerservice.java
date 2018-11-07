package com.jk.service.partnerservice;

import com.jk.model.Partner;

import java.util.List;

public interface Partnerservice {
   //
    List<Partner> selectpartner();
    void addpartner(Partner str);

    void updatestart();

    void delpartner(Integer userid);
    //取出小于20天的数据
    List<Partner> selectpartnerEnd();
    //查询小于5天的数据
    List<Partner> selectpartnerEndUpdate();
    //修改到期广告的状态
    void updatePartner(Integer ids);
}
