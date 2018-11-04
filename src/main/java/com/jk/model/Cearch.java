package com.jk.model;

import java.io.Serializable;

public class Cearch  implements Serializable {

    private static final long serialVersionUID = -8993678681456780616L;
    private String  zids;

    private String  ztext;


    public String getZids() {
        return zids;
    }

    public void setZids(String zids) {
        this.zids = zids;
    }

    public String getZtext() {
        return ztext;
    }

    public void setZtext(String ztext) {
        this.ztext = ztext;
    }
}
