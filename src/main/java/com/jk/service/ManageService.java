package com.jk.service;

import com.jk.model.suppt.Manage;

import java.sql.SQLOutput;
import java.util.List;

public interface ManageService {
    String selectManage();
    void addfx(String title, String btext, String topics);


}
