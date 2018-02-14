import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
      Timer timer1;
      Timer timer2;



    public Reminder() {

          int second1 = 10;
          int second2 = 10;




          timer1 = new Timer();
          timer2 = new Timer();


          timer1.schedule(new task1(), second1*1000);
          timer2.schedule(new task2(), second2*1000);

    }

      class task1 extends TimerTask {
          public void run() {
            Main.naam = false;
          timer1.cancel(); //Terminate the timer thread

          }
      }

      class task2 extends TimerTask {
          public void run() {


            timer2.cancel(); //Terminate the timer thread

          }
      }




}
