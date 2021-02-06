package jti.polinema.polimorfisme.tugas;

import java.util.Scanner;

public class WalkingZombie extends Zombie{
    static Scanner sc = new Scanner(System.in);

    public WalkingZombie() {
        System.out.print("Masukkan health walking zombie: ");
        super.health = sc.nextInt();
        System.out.print("Masukkan level walking zombie: ");
        super.level = sc.nextInt();
    }

    @Override
    public void heal() {
        switch (super.level) {
            case 1:
                health += (10 /100 * health);
                break;
            case 2:
                health += (30 / 100 * health);
                break;
            case 3:
                health += (40 / 100 * health);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (20 * health / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = "";
        info += "Walking Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}