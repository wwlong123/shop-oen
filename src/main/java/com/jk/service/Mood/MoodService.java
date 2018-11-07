package com.jk.service.Mood;

import com.jk.model.*;
import com.jk.model.Modeljihe.*;

import java.util.List;

public interface MoodService {

    List<mood> selectmood();

    void addzan(String id);

    void addcai(String cid);

    void selectLogInfo();

    List<mood> selectcearch();
    //心情展示
    void savexinqing(mood mood);
   //关键字查询
    List<Cearch> guanjianzi();

    List<Share> selectshare();

    List<Questions> selectmoodService();
   //最新博客查询
    List<boke> selectboke();
    //Users 最牛用户查询
    List<Users> selectUsers();
    //每个2小时修改一次
    void updatedengji();
    //广告
    Partner selecPartner();
   //广告定时跟新
    Partner tupian();

    //最热评论
    List<Share> chaxunshare();
}
