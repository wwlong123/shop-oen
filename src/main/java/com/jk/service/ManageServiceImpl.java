package com.jk.service;

import com.alibaba.fastjson.JSON;
import com.jk.dao.suppt.ManageDao;
import com.jk.model.suppt.Manage;

import com.jk.model.suppt.Manage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class ManageServiceImpl implements ManageService{
    @Autowired
    private ManageDao manageDao;


    @Override
      public   String selectManage() {
        List<Manage> list = manageDao.selectManage(0);
        for (Manage area : list) {
            Integer id = area.getZid();
            List<Manage> getchild =manageDao.selectManage(id);
            area.setManagesList(getchild);
        }
        return JSON.toJSONString(list);

    }

    @Override
    public void addfx(String title, String btext, String topics) {
        Date time = new Date();
        manageDao.addfx(title,btext,topics,time);
    }


}
