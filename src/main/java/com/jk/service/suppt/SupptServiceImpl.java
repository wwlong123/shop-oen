package com.jk.service.suppt;

import com.jk.dao.suppt.DaoSuppt;
import com.jk.model.suppt.Share;
import com.jk.model.suppt.Suppt;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupptServiceImpl implements  SupptService {

    @Autowired
    private DaoSuppt daosuppt;


    @Override
    public List<Share> querySuppt(Integer start,Integer pageSize) {
        return daosuppt.querySuppt(start,pageSize);
    }

    @Override
    public void updateSuppt(Integer id) {
        daosuppt.updateSuppt( id);
    }


}
