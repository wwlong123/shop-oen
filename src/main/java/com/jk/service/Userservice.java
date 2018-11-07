package com.jk.service;

import com.jk.model.Htuser;
import com.jk.model.Users;

public interface Userservice {
    void adduser(Users str);

    Users userpas(String usereamil, String userpass);

    void addhoutai(Htuser str);

    void updateuser(Users userpass);

    void updatetupian(Users str);

    void addusernb(Integer usernb,Integer userid);
}
