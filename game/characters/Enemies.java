package characters;

public class Enemies {

private int enemyHealth;
private int enemyAttack;


public Enemies(){
  this.enemyHealth = 10;
  this.enemyAttack = 3;
}
public Enemies(int enemyHealth, int enemyAttack){
  this.enemieHealth = enemyHealth;
  this.enemieAttack = enemyAttack;

}

  public int getEnemieHealth(){
    return this.enemyHealth;
  }
  public int getEnemieAttack(){
    return this.enemyAttack;
  }

  public void setenemieHealth(int health){
    this.enemyHealth = enemyHealth;
  }
  public void setAttack(int attack){
    this.enemyAttack = enemyAttack;
  }
}
