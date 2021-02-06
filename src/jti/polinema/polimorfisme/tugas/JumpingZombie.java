package jti.polinema.polimorfisme.tugas;

import java.util.Scanner;

public class JumpingZombie extends Zombie{
    static Scanner sc = new Scanner(System.in);

    public JumpingZombie() {
        System.out.print("Masukkan health jumping zombie: ");
        super.health = sc.nextInt();
        System.out.print("Masukkan level jumping zombie: ");
        super.level = sc.nextInt();
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                health += (30 * health / 100);
                break;
            case 2:
                health += (40 * health / 100);
                break;
            case 3:
                health += (50 * health / 100);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (10 * health / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = "";
        info += "Jumping Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}