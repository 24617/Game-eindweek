import java.util.Scanner;
import java.util.Random;
import characters.*;

public class CombatSystem
{
public static Scanner scanner = new Scanner(System.in);

public static int health = 40;
public static int slash = 20;
public static int energy = 50;


public static void main(String[] args)
{


  Random number = new Random();
  String msg = "";

 myLabel.setText("There is a dummy over there lets attack it!");
 int game1 = 1;
 while (game1 == 1) {
   game1 = 2;
 if ........ {
   myLabel.setText("You attacked it.");
   enemyHealth = enemyHealth - orcAttack[number.nexInt(orcAttack.length)];
   Thread.sleep(10000);
   if (enemyHealth >= 0) {
     myLabel.setText("The dummy is attacking");

   }


   if (enemyHealth <= 0 || enemyHealth == 0) {
     enemyHealth  = 0;
     myLabel.setText("You killed the dummy!");
 }

}
}
}
