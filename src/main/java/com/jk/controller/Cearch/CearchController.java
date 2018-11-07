package com.jk.controller.Cearch;

import com.jk.model.Cearch;
import com.jk.service.Cearch.CearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cearch")
public class CearchController {
    @Autowired
    private CearchService cearchService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("selectcearcha")
    public  String selectcearcha(){
        return  "zy/Cearch";
    }

    //查询
    @RequestMapping("selectcearch")
    @ResponseBody
    public Map<String,Object> selectcearch (Integer start , Integer pageSize){
        Map<String,Object> list = cearchService.selectcearch(start,pageSize);
        return list;
    }


    //新增跳转页面
    @RequestMapping("tomongodialog")
    public String tomongodialog(){
        return	"zy/save";
    }

    @RequestMapping("savecaerch")
    @ResponseBody
    public  String savecaerch(Cearch ch){
//        cearchService.savecaerch(ch);
//        String ztext = ch.getZtext();
//        String search="";
//        for(int i=0;i<ztext.length();i++){
//            search+="<a href='javascript:add("+ztext+")'>"+ztext+"</a>";
//        }
//       redisTemplate.opsForValue().set("search",search);
        return "1";
    }

    //删除
    @RequestMapping("deletech")
    @ResponseBody
    public  String deletech(String id){
        cearchService.deletech(id);
        return "11";
    }



}
