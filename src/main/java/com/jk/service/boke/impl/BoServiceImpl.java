package com.jk.service.boke.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.boke.BoDao;
import com.jk.model.boke.boke;
import com.jk.service.boke.BoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class BoServiceImpl implements BoService {
    @Autowired
    private BoDao boDao;
    @Override
    public void selectB() {
        System.out.println("进来了");
    }

    @Override
    public void saveBoke(boke boke) {
        boke.setCreDate(new Date());
        boke.setCount(0);
        boke.setBrowse(0);
        boDao.saveBoke(boke);
    }

    @Override
    public List<boke> selectBoke() {
        return boDao.selectBoke();
    }

    @Override
    public boke queryBoke(boke bo) {
        boDao.updateBoke(bo);
        return  boDao.queryBoke(bo);
    }

    @Override
    public HashMap<String, Object> findBoke(int start, int pageSize) {

        long count =boDao.findBokeCount();
        List<boke>list=boDao.findBokeList(start,pageSize);
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public void updateBoke(boke boke) {
        boDao.updateBokeState(boke);
    }
}
