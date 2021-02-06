package jti.polinema.inheritance.teori2;

public class Lingkaran extends BangunDatar {
    public float r;

    @Override
    public float luas() {
        float luas = (float) (Math.PI * r * r);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        return keliling;
    }
}
