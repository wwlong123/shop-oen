package com.jk.service.loginservice;

import com.jk.dao.logindao.logindao;
import com.jk.model.Tree;
import com.jk.model.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginserviceimpl implements loginservice {

    @Autowired
    private logindao logindao;

    @Override
    public login selectuser(String username, String userpas) {
        return logindao.selectuser(username,userpas);
    }
    @Override
    public   List<Tree> selectTree() {

        List<Tree> list = logindao.selectTree(0);
        for (Tree area : list) {
            Integer id = area.getId();
            List<Tree> getchild =logindao.selectTree(id);
            area.setNodes(getchild);
        }
        return list;

    }

}
