package com.jk.service.Cearch;

import com.jk.model.Cearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CearchService {
   

    void savecaerch(Cearch ch);

    void deletech(String id);


    Map<String, Object> selectcearch( Integer start,Integer pageSize);
}
