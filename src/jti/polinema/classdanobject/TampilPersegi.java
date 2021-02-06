package jti.polinema.classdanobject;

public class TampilPersegi {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();

        persegi.sisi = 10;
        persegi.dataPersegi();
        System.out.println("Luas persegi : " + persegi.luasPersegi());
        System.out.println("Keliling persegi : " + persegi.kelilingPersegi());
    }

}
