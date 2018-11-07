package com.jk.service;

import com.jk.dao.Userdao;
import com.jk.model.Htuser;
import com.jk.model.Usernb;
import com.jk.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void addhoutai(Htuser str) {
        userdao.addhoutai(str);
    }

    @Override
    public void updateuser(Users userpass) {
        userdao.updateuser(userpass);
    }

    @Override
    public void updatetupian(Users str) {
        userdao.updatetupian(str);
    }

    @Override
    public void addusernb(Integer usernb,Integer userid) {
       Integer list=userdao.selectusernb(userid);
       if (list==null){
           userdao.addusernb(usernb,userid);
       }
        userdao.updateusernb(usernb,userid);
    }
}
