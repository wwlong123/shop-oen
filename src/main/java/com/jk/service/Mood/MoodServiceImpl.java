package com.jk.service.Mood;

import com.jk.dao.MoodDao;
import com.jk.model.mood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MoodServiceImpl implements  MoodService{

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


}
