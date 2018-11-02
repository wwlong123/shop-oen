package com.jk.service.partnerservice;

import com.jk.dao.partnerdao.Partnerdao;
import com.jk.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class Partnerserviceimpl implements Partnerservice {

    @Autowired
    private Partnerdao partnerdao;

    @Override
    public List<Partner> selectpartner() {
            /**
             * 延迟5000毫秒，每1000毫秒执行一次
             */
            /*Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                int  start =0;
                public void run() {
                    List<Partner> list2 = partnerdao.selectpartner();
                    partnerdao.updatestart();
                    System.out.println("-------存储成功--------");
                    start++;
                }
            }, 5000, 1000*10);*/
        return partnerdao.selectpartner();
    }

    @Override
    public void addpartner(Partner str) {
        partnerdao.addpartner(str);
    }

    @Override
    public void updatestart() {
        partnerdao.updatestart();
    }


}
