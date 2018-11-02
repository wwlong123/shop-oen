package com.jk.service;

import com.jk.dao.Userdao;
import com.jk.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice{

    @Autowired
    private Userdao userdao;

    @Override
    public void adduser(Users str) {
        userdao.adduser(str);
    }
    @Override
    public Users userpas(String usereamil, String userpass) {
        return (Users) userdao.userpas(usereamil,userpass);
    }
}
