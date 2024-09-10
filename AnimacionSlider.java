import java.util.Timer;
import java.util.TimerTask;

public class AnimacionSlider{
    private static final long Intervalo_Inicial =2*60*1000;
    private static final long Intervalo_Alarma = 10*1000;
    
    public static void main (String[]args){
        Timer timerInicial= new Timer ();
        
        timerInicial.schedule(new TimerTask(){
            @Override
            public void run (){
                System.out.println("¡Alarma activada!");
                Timer timerAlarma= new timer(); 
                timerAlarma.scheduleAtFixedRate(new Timer Task(){
                @Override
                public void run (){
                    SimpleDataFormat sdf = new SimpleDataFomat("HH:mm:ss");
                        System.out.println("Hora actual: " + sdf.format(new Date ()));
                }
                }, 0, Intervalo_Alarma);
            }
            },0,Intervalo_Inicial);
    }
}
            
        
        
        
    }
}
