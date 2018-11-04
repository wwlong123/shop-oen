package com.jk.service.acti;

import com.jk.dao.acti.DaoActi;

import com.jk.model.suppt.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiServiceImpl implements ActiService {
    @Autowired
    private DaoActi daoActi;

    @Override
    public List<Activity> queryActivity() {
        return daoActi.queryActivity();
    }

    @Override
    public void updateActivityt(Integer id) {
        daoActi.updateActivityt(id);
    }
}
