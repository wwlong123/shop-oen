package com.jk.controller.Mood;

import com.jk.model.Cearch;
import com.jk.model.mood;
import com.jk.service.Mood.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("pinglun")
public class PinglunController {
      @Autowired
      private MoodService moodService;

    //后台展示
      @RequestMapping("houmood")
      public  String houmood(){

          return "zy/Mood";
      }
      @RequestMapping("selectcearch")
      @ResponseBody
      public   List<mood> selectcearch(){
          List<mood> list= moodService.selectcearch();
          return  list;
      }




    //前台展示
    @RequestMapping("selectmood")
    public   String selectmood(Model model){
        List<mood> listmood= moodService.selectmood();
        model.addAttribute("list",listmood);

        List<Cearch> listCearch=moodService.guanjianzi();
        model.addAttribute("search",listCearch);
        return  "/hjw/indexshou";
    }

    //点赞
    @RequestMapping("addzan")
    @ResponseBody
    public  String  addzan(String id){
        moodService.addzan(id);
        return "1";
    }

    //踩
    @RequestMapping("addcai")
    @ResponseBody
    public String addcai(String  cid){
        moodService.addcai(cid);
        return "11";
    }

    @RequestMapping("selectLogInfo")
    public  void time() {
        //定义线程池
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 100; i++) {
            int index = i;
            scheduledThreadPool.schedule(new Runnable() {
                public void run() {
                    try {
                        selectLogInfo(index);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 1, TimeUnit.SECONDS);
        }
    }

    public void selectLogInfo(int i){
        moodService.selectLogInfo();
    }

   //心情新增
    @RequestMapping("savexinqing")
    @ResponseBody
    public String  savexinqing(mood mood){
        moodService.savexinqing(mood);
        return "1";
    }



}
