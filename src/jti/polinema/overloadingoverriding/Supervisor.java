package jti.polinema.overloadingoverriding;

public class Supervisor extends Managers {
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    public void naikkanGaji() {
        gaji += 1500000;
    }
}
