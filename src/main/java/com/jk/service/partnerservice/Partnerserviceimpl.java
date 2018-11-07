package com.jk.service.partnerservice;

import com.jk.dao.partnerdao.Partnerdao;
import com.jk.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Partnerserviceimpl implements Partnerservice {

    @Autowired
    private Partnerdao partnerdao;

    @Override
    public List<Partner> selectpartner() {

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

    @Override
    public void delpartner(Integer userid) {
        partnerdao.delpartner(userid);
    }

    @Override
    public List<Partner> selectpartnerEnd() {
        return partnerdao.selectpartnerEnd();
    }

    @Override
    public List<Partner> selectpartnerEndUpdate() {
        return partnerdao.selectpartnerEndUpdate();
    }

    @Override
    public void updatePartner(Integer ids) {
        partnerdao.updatePartner(ids);
    }


}
