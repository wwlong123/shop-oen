package com.jk.service.Mood;

import com.jk.model.mood;

import java.util.List;

public interface MoodService {

    List<mood> selectmood();

    void addzan(String id);

    void addcai(String cid);

    void selectLogInfo();

    List<mood> selectcearch();

    void savexinqing(mood mood);
}
