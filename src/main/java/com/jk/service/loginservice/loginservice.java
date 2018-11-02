package com.jk.service.loginservice;

import com.jk.model.Tree;
import com.jk.model.login;

import java.util.List;

public interface loginservice {
    login selectuser(String username,String userpas);

    List<Tree> selectTree();
}
