import java.util.Timer.*;
import java.util.TimerTask.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.*;

public class Main extends Application
  {


    public static void main(String[] args)
      {

          launch(args);

      }
          private Pane myPane = new Pane();
          private Scene myScene = new Scene(myPane,1500, 900);

          public Timer myTimer = new Timer(this::Update);

          private Image lucht = new Image("img/achterBlauw.png");
          public static ImageView luchtView;

          private Image grond = new Image("img/pad.png");
          public static ImageView grondView;

          private Image boom1 = new Image("img/achterBoom1.png");
          public static ImageView boom1View;

          private Image boom2 = new Image("img/achterBoom.png");
          private static ImageView boom2View;

          private Image fog = new Image("img/achterFog.png");
          public static ImageView fogView;

          private Image orc = new Image("img/orc.png");
          public static ImageView orcView;

          private Image orc2 = new Image("img/orc2.png");
          public static ImageView orc2View;

          private Image orc3 = new Image("img/orc2.png");
          public static ImageView orc3View;

          private Image chest = new Image("img/chest.png");
          public static ImageView chestView;






        public void start(Stage primaryStage)

        {
          primaryStage.setScene(myScene);
          primaryStage.setTitle("Orgo");
          primaryStage.show();

          myTimer.start();

          new Reminder();





            //ACHTERGROND LUCHT
              luchtView = new ImageView(lucht);
              luchtView.setX(250);
              luchtView.setY(150);
              luchtView.setScaleX(1.5);
              luchtView.setScaleY(1.5);

              //ACHTERGROND
              grondView = new ImageView(grond);
              grondView.setX(250);
              grondView.setY(150);
              grondView.setScaleX(1.5);
              grondView.setScaleY(1.5);
              //BOOM1
              boom1View = new ImageView(boom1);
              boom1View.setX(250);
              boom1View.setY(150);
              boom1View.setScaleX(1.5);
              boom1View.setScaleY(1.5);
              //BOOM2
              boom2View = new ImageView(boom2);
              boom2View.setX(250);
              boom2View.setY(150);
              boom2View.setScaleX(1.5);
              boom2View.setScaleY(1.5);
              //FOG
              fogView = new ImageView(fog);
              fogView.setX(250);
              fogView.setY(150);
              fogView.setScaleX(1.5);
              fogView.setScaleY(1.5);

              orcView = new ImageView(orc);
              orcView.setX(350);
              orcView.setY(300);
              orcView.setScaleX(1.5);
              orcView.setScaleY(1.5);

              chestView = new ImageView(orc);
              chestView.setX(250);
              chestView.setY(150);
              chestView.setScaleX(1.5);
              chestView.setScaleY(1.5);



                // laatste toegevoegt komt eerst
              myPane.getChildren().add(luchtView);
              myPane.getChildren().add(boom2View);
              myPane.getChildren().add(boom1View);
              myPane.getChildren().add(grondView);
              myPane.getChildren().add(fogView);
              myPane.getChildren().add(orcView);




        }
          public static  boolean naam = true;

              // METHODE MOET DEZELFDE TITEL BEVATTEN:
              public void Update(long nanoTime)
              {
                //System.out.println("HALLO!");

                // BEWEEG PLAATJE ELKE UPDATE 1 [X] PIXELS [X] NAAR RECHTS/BENEDEN:
                if (naam == true)
                {
                  luchtView.setX(luchtView.getX() - 1);
                  fogView.setX(fogView.getX() - 1);
                  boom1View.setX(boom1View.getX() - 1);
                  grondView.setX(grondView.getX() - 2);
                  boom2View.setX(boom2View.getX() - 0.5);
                }




              }









}
