package jti.polinema.polimorfisme.tugas;

public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        String info = "";
        info += "Health = " + this.health + "\n";
        info += "Level = " + this.level + "\n";
        return info;
    }
}