package game;
public class Game {
    public static void main(String[] args) {
        //buat objek
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.name = "ntekarlus";
        hero.speed = 60 ;
        hero.damage = 20;
        hero.armor = 10;
        hero.healthPoin = 100;
        
        enemy.name = "zombie";
        enemy.speed = 20 ;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoin = 90;
                
        hero.run();
        hero.attack(enemy.name);
        if(hero.isDead()){
            System.out.println("Game Over :(" );
            
        }
        Superman abshadow = new Superman();
        
        abshadow.energi = 50;
        abshadow.ketinggian = 100;
        abshadow.kecepatan = 60;
        abshadow.superman = "Suprapto";
        
        abshadow.terbang();
        abshadow.SupermanBerhenti();
        abshadow.TerbangKiri();
        abshadow.TerbangKanan();
        abshadow.SupermanTurun();
        abshadow.Moonwalk();
         
        
    }
    
}
