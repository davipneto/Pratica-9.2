
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Timer;
import utfpr.ct.dainf.if62c.avaliacao.MensagemTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1608398
 */
public class Pratica92 {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            
    public static void main(String[] args){
        
        System.out.println("Pressione Enter para terminar");
        System.out.println("Hora de início: " + sdf.format(new Date()));
        long atraso = 60000 - new Date().getTime()%60000;
        Timer t = new Timer("hora-cheia");
        t.schedule(new MensagemTask(), atraso, 60000);
    }
}
