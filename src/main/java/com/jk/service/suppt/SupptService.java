package com.jk.service.suppt;

import com.jk.model.suppt.Share;
import com.jk.model.suppt.Suppt;

import java.util.List;

public interface SupptService {

    List<Share> querySuppt(Integer start, Integer pageSize);
    void updateSuppt(Integer id);
}
