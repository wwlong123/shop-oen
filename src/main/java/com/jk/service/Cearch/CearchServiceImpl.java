package com.jk.service.Cearch;

import com.jk.dao.CearchDao;
import com.jk.model.Cearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CearchServiceImpl implements  CearchService{

    @Autowired
    private CearchDao cearchDao;


    @Override
    public void savecaerch(Cearch ch) {
        String uuid= UUID.randomUUID().toString();
        ch.setZids(uuid);
        cearchDao.savecaerch(ch);
    }

    @Override
    public void deletech(String id) {
        cearchDao.deletech(id);
    }

    @Override
    public Map<String, Object> selectcearch(Integer start,Integer pageSize) {
        List<Cearch> listem = cearchDao.selectid( start,pageSize);
        long count = cearchDao.emcount();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", listem);

        return map;
    }





}
