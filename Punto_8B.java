import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class Punto_8B {
    
   private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;

    public void iniciar() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
                System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            }
        }, 0, 1000);
    }

    public static void main(String[] args) {
        Punto_8B cronometro = new Punto_8B();
        cronometro.iniciar();
    }
}
