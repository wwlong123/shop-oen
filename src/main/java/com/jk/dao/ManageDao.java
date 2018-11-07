package com.jk.dao;

import com.jk.model.Modeljihe.Manage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ManageDao {
    @Select(" select *from  z_suppt where zpid=#{0}")
    List<Manage> selectManage(int i);


}
