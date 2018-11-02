package com.jk.service;

import com.jk.model.Users;

public interface Userservice {
    void adduser(Users str);

    Users userpas(String usereamil, String userpass);
}
