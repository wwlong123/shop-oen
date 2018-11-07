package com.jk.service.Mood;

import com.jk.ShopOenApplication;
import com.jk.dao.MoodDao;
import com.jk.model.*;
import com.jk.model.Modeljihe.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static java.lang.Integer.parseInt;

@Service
public class MoodServiceImpl<main> implements  MoodService{

    @Autowired
    private MoodDao moodDao;

    @Override
    public List<mood> selectmood() {

        List<mood> selectmood = moodDao.selectmood();
        return selectmood;
    }

    @Override
    public void addzan(String id) {

        moodDao.addzan(id);
    }

    @Override
    public void addcai(String cid) {
        moodDao.addcai(cid);
    }

    @Override
    public void selectLogInfo() {
        moodDao.selectLogInfo();
    }

    @Override
    public List<mood> selectcearch() {
        return moodDao.selectcearch();
    }

    @Override
    public void savexinqing(mood mood) {

        moodDao.savexinqing(mood);
    }


    @Override
    public List<Cearch> guanjianzi() {
        return moodDao.guanjianzi();
    }

    @Override
    public List<Share> selectshare() {
        return moodDao.selectshare();
    }

    @Override
    public List<Questions> selectmoodService() {
        return moodDao.selectmoodService();
    }

    @Override
    public List<boke> selectboke() {
        return moodDao.selectboke();
    }

    @Override
    public List<Users> selectUsers() {
      int yueliang=-1;// 月亮
        for (int i=9;true;i-=4 ){
            if(i>0){
                yueliang++;
            }else{
                break;
            }
        }
        int c=9-yueliang*4;//星星
        //月亮图
        String yuefile="";
        for(int i=0;i<yueliang;i++){
            yuefile+="<img src='https://wwlong.oss-cn-beijing.aliyuncs.com/Along1541429871188.png' class='lv'>";
        }
       //星星图
        for(int i=0;i<c;i++){
            yuefile+="<img src='https://wwlong.oss-cn-beijing.aliyuncs.com/Along1541429874810.png' class='lv'>";
        }
        moodDao.update(yuefile);
        return moodDao.selectUsers();
    }

    @Override
    public void updatedengji() {
        moodDao.updatedengji();
    }

    @Override
    public Partner selecPartner() {
        List<Partner> partners = moodDao.selecPartner();
        int intBounded =0+ ((int) (new Random().nextFloat() * ( partners.size())));
        return partners.get(intBounded);
    }

    @Override
    public Partner tupian() {
        List<Partner> partner = moodDao.tupian();
        int intBounde =0+ ((int) (new Random().nextFloat() * ( partner.size())));
        return partner.get(intBounde);
    }

    @Override
    public List<Share> chaxunshare() {
        return moodDao.chaxunshare();
    }


}
