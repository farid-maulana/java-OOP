package jti.polinema.polimorfisme.teori;

public class TestBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran untuk Manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer: " + hr.hitungBayaran(prog));
    }
}