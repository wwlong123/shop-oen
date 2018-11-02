package com.jk.model;


import java.io.Serializable;

public  class login implements Serializable {

    private static final long serialVersionUID = 7313064189660419927L;
         private Integer userid;

        private String username;

        private String userpas;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpas() {
        return userpas;
    }

    public void setUserpas(String userpas) {
        this.userpas = userpas;
    }

    @Override
    public String toString() {
        return "login{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpas='" + userpas + '\'' +
                '}';
    }
}
