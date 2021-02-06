package jti.polinema.polimorfisme.tugas;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie();
        JumpingZombie jz = new JumpingZombie();
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}