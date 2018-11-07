package com.jk.model.Modeljihe;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Questions implements Serializable {
    private static final long serialVersionUID = -3532162166534183713L;

    private Integer questionsid;

    private Integer status;

    private String questionstitle;

    private String questionsbrowse;

    private String questionscomment;

    private String questionscattleb;

    private String questionsanswer;

    private String keywordid;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date questionsdate;

    private String questionscontet;

    //用户表字段
    private Integer userid;
    private String username;
    private String usereamil;
    private String userpass;
    private String userimge;
    private Integer usershareid;
    private Integer userdengjiid;
    private String manageid;

    public String getManageid() {
        return manageid;
    }

    public void setManageid(String manageid) {
        this.manageid = manageid;
    }

    //关键字表字段
    private Integer zids;
    private String ztext;
    private String zquestionsid;

    private String array[];

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }




    public Integer getZids() {
        return zids;
    }

    public void setZids(Integer zids) {
        this.zids = zids;
    }

    public String getZtext() {
        return ztext;
    }

    public void setZtext(String ztext) {
        this.ztext = ztext;
    }

    public String getZquestionsid() {
        return zquestionsid;
    }

    public void setZquestionsid(String zquestionsid) {
        this.zquestionsid = zquestionsid;
    }


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

    public String getUsereamil() {
        return usereamil;
    }

    public void setUsereamil(String usereamil) {
        this.usereamil = usereamil;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUserimge() {
        return userimge;
    }

    public void setUserimge(String userimge) {
        this.userimge = userimge;
    }

    public Integer getUsershareid() {
        return usershareid;
    }

    public void setUsershareid(Integer usershareid) {
        this.usershareid = usershareid;
    }

    public Integer getUserdengjiid() {
        return userdengjiid;
    }

    public void setUserdengjiid(Integer userdengjiid) {
        this.userdengjiid = userdengjiid;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getQuestionsid() {
        return questionsid;
    }

    public void setQuestionsid(Integer questionsid) {
        this.questionsid = questionsid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getQuestionstitle() {
        return questionstitle;
    }

    public void setQuestionstitle(String questionstitle) {
        this.questionstitle = questionstitle;
    }

    public String getQuestionsbrowse() {
        return questionsbrowse;
    }

    public void setQuestionsbrowse(String questionsbrowse) {
        this.questionsbrowse = questionsbrowse;
    }

    public String getQuestionscomment() {
        return questionscomment;
    }

    public void setQuestionscomment(String questionscomment) {
        this.questionscomment = questionscomment;
    }

    public String getQuestionscattleb() {
        return questionscattleb;
    }

    public void setQuestionscattleb(String questionscattleb) {
        this.questionscattleb = questionscattleb;
    }

    public String getQuestionsanswer() {
        return questionsanswer;
    }

    public void setQuestionsanswer(String questionsanswer) {
        this.questionsanswer = questionsanswer;
    }

    public String getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(String keywordid) {
        this.keywordid = keywordid;
    }

    public Date getQuestionsdate() {
        return questionsdate;
    }

    public void setQuestionsdate(Date questionsdate) {
        this.questionsdate = questionsdate;
    }

    public String getQuestionscontet() {
        return questionscontet;
    }

    public void setQuestionscontet(String questionscontet) {
        this.questionscontet = questionscontet;
    }





}