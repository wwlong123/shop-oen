package com.jk.service.Manage;

import com.jk.dao.ManageDao;
import com.jk.model.Modeljihe.Manage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ManageServiceImpl implements ManageService{
    @Autowired
    private ManageDao manageDao;


    @Override
      public    List<Manage>  selectManage() {
        List<Manage> list = manageDao.selectManage(0);
        for (Manage area : list) {
            Integer id = area.getZid();
            List<Manage> getchild =manageDao.selectManage(id);
            area.setManagesList(getchild);
        }
        return list;

    }




}
