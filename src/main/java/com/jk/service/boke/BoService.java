package com.jk.service.boke;

import com.jk.model.boke.boke;

import java.util.HashMap;
import java.util.List;

public interface BoService {
    void selectB();
    void saveBoke(boke boke);
    List<boke> selectBoke();
    boke queryBoke(boke bo);
    HashMap<String, Object> findBoke(int start, int pageSize);
    void updateBoke(boke boke);
}
