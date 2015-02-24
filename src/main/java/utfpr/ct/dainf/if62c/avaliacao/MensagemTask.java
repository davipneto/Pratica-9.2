/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author a1608398
 */
public class MensagemTask extends TimerTask {
    
    private final Date now = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");
    
    @Override
    public void run(){
        now.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(now));
    }
}
