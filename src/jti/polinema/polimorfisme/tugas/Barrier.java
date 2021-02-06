package jti.polinema.polimorfisme.tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= (0.1 * strength);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }
}