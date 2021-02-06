package jti.polinema.inheritance.teori2;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        float luas = (alas * tinggi) / 2;
        return luas;
    }
}
