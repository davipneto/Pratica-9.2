/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author a1608398
 */
public class MinutoTask extends TimerTask {
    
    private final Date now = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");
    Timer t = new Timer("minuto-impar");
    MensagemImparTask mti;
    
    public boolean eimpar(){
        return now.getTime() % 120000 >= 60000;
    }
    
    @Override
    public void run(){
        now.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(now));
        if(eimpar()){
            mti = new MensagemImparTask();
            t.schedule(mti, 10000, 10000);
        }{
            if(mti!=null){
                mti.cancel();
            }
        }
    }
}
